package com.powernode.spring.bean;

import java.util.Date;

public class Dog {
    private String name;
    private Integer age;
    private Date birth;
    public Dog(){
        System.out.println("Dog执行了");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
