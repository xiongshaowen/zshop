package com.itany.zshop.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Author：汤小洋
 * Date：2018-05-02 17:14
 * Description：<描述>
 */
public class SpringBeanHolder implements ApplicationContextAware {

    private static ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ac=applicationContext;
    }

    public static Object getBean(String beanName){
        return ac.getBean(beanName);
    }
}
