package com.itany.zshop.service.impl;

import com.itany.zshop.common.constant.CustomerConstant;
import com.itany.zshop.common.exception.LoginErrorException;
import com.itany.zshop.common.exception.PhoneNotRegistException;
import com.itany.zshop.dao.CustomerDao;
import com.itany.zshop.pojo.Customer;
import com.itany.zshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author：汤小洋
 * Date：2018-05-15 14:02
 * Description：<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Customer login(String loginName, String password) throws LoginErrorException {
        Customer customer = customerDao.selectByLoginNameAndPassword(loginName, password, CustomerConstant.CUSTOMER_VALID);
        if (customer == null) {
            throw new LoginErrorException("登陆失败，用户名或密码不正确");
        }
        return customer;
    }

    @Override
    public Customer findByPhone(String phone) throws PhoneNotRegistException {
        Customer customer = customerDao.selectByPhone(phone);
        if (customer == null) {
            throw new PhoneNotRegistException("该手机号码尚未注册");
        }
        return customer;
    }

}
