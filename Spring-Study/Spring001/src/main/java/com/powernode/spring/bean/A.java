package com.powernode.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {
    public A() {
        System.out.println("A执行了");
    }
}
@Component
class B{
    public B(){
        System.out.println("B执行了");
    }
}
@Controller
class C{
    public C(){
        System.out.println("C执行了");
    }
}
@Controller
class D{
    public D(){
        System.out.println("D执行了");

    }
}
@Service
class E{
    public E(){
        System.out.println("E执行了");

    }
}
@Repository
class F{
    public F(){
        System.out.println("F执行了");

    }
}