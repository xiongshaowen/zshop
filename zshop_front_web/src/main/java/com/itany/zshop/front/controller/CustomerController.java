package com.itany.zshop.front.controller;

import com.itany.zshop.common.constant.ResponseStatusConstant;
import com.itany.zshop.common.exception.LoginErrorException;
import com.itany.zshop.common.exception.PhoneNotRegistException;
import com.itany.zshop.common.util.RedisUtils;
import com.itany.zshop.common.util.ResponseResult;
import com.itany.zshop.pojo.Customer;
import com.itany.zshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Author：汤小洋
 * Date：2018-05-15 13:57
 * Description：<描述>
 */
@Controller
@RequestMapping("/front/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @RequestMapping("/loginByAccount")
    @ResponseBody
    public ResponseResult loginByAccount(String loginName, String password, HttpSession session) {
        ResponseResult result = new ResponseResult();
        try {
            Customer customer = customerService.login(loginName, password);
            session.setAttribute("customer", customer);
            result.setData(customer);
            result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
        } catch (LoginErrorException e) {
            //e.printStackTrace();
            result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @RequestMapping("/logout")
    @ResponseBody
    public ResponseResult logout(HttpSession session) {
        session.invalidate();
        return ResponseResult.success();
    }

    @RequestMapping("/loginBySms")
    @ResponseBody
    public ResponseResult loginBySms(String phone, int verificationCode, HttpSession session) {
        ResponseResult result = ResponseResult.fail();
        try {
            //判断手机号是否注册
            Customer customer = customerService.findByPhone(phone);

            //判断验证码是否存在
            //Object obj = session.getAttribute("randVerificationCode");
            //从Redis中获取验证码
            String str = RedisUtils.get(session.getId());

            if (!ObjectUtils.isEmpty(str)) {
                //判断验证码是否正确
                Integer randVerificationCode = Integer.parseInt(str);
                if (randVerificationCode == verificationCode) {
                    session.setAttribute("customer", customer);
                    result.setData(customer);
                    result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
                } else {
                    result.setMessage("验证码不正确");
                }
            } else {
                result.setMessage("验证码不存在或已过期，请重新输入");
            }
        } catch (PhoneNotRegistException e) {
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
