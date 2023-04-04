package com.itany.zshop.service;

import com.itany.zshop.common.exception.LoginErrorException;
import com.itany.zshop.common.exception.PhoneNotRegistException;
import com.itany.zshop.pojo.Customer;

/**
 * Author：汤小洋
 * Date：2018-05-15 13:58
 * Description：<描述>
 */
public interface CustomerService {

    public Customer login(String loginName, String password) throws LoginErrorException;

    Customer findByPhone(String phone) throws PhoneNotRegistException;
}
