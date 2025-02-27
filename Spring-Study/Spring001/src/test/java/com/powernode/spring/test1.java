package com.powernode.spring;

import com.powernode.spring.bean.Dog;
import com.powernode.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testSpring1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("UserBean");
        System.out.println(userBean);
    }
    @Test
    public void testSpring2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        //UserService userService = applicationContext.getBean("UserService", UserService.class);
    }
    @Test
    public void testP(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Dog dog = applicationContext.getBean("DogBean", Dog.class);
        System.out.println(dog);
    }
    @Test
    public void testAnnotation(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

    }
}
