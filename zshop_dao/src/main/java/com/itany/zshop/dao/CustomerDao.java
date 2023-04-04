package com.itany.zshop.dao;

import com.itany.zshop.pojo.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * Author：汤小洋
 * Date：2018-05-15 14:03
 * Description：<描述>
 */
public interface CustomerDao {

    public Customer selectByLoginNameAndPassword(@Param("loginName")String loginName, @Param("password")String password, @Param("isValid")Integer isValid);

    Customer selectByPhone(String phone);
}
