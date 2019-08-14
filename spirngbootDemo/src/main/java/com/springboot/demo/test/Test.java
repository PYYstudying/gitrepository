package com.springboot.demo.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<User, Integer> treeMap = new TreeMap<>();
        treeMap.put(new User("dd",2),null);
        treeMap.put(new User("cc",3),2);
        treeMap.put(new User("aa",3),3);
        Iterator<Map.Entry<User, Integer>> iterator = treeMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<User, Integer> next = iterator.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }
    }
}
