package com.io.demo1;

import java.util.Hashtable;

public class TestString {
    public static void main(String[] args) {
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
        objectObjectHashtable.put("username", "alex");
        objectObjectHashtable.put("password", "jerry");

        System.out.println(objectObjectHashtable.size());
        System.out.println(objectObjectHashtable.isEmpty());
        System.out.println(objectObjectHashtable.getClass());


        Object clone = (Hashtable) objectObjectHashtable.clone();
        ((Hashtable) clone).remove("username");
        System.out.println(clone);

    }

    public synchronized String getContent(){
        return null;
    }
}
