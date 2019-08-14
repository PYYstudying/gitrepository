package com.springboot.demo.test;

import lombok.ToString;

@ToString
public class User implements Comparable<User>{

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if(o == null){
            throw new NullPointerException("user is null");
        }
        int result = this.age - o.age;
        return result == 0 ? this.name.compareTo(o.name) : result;
    }

}
