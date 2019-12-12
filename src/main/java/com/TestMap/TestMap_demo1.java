package TestMap;

import java.util.HashMap;

/**
 * map测试
 * put
 * get
 * map(interface)
 * HashMap、TreeMap、HashTable、Properties
 */
public class TestMap_demo1 {
    public static void main(String[] args) {

        System.out.println();
        HashMap hp = new HashMap();
        hp.put("username", "alex");
        hp.put("password", "kkk");
        System.out.println(hp.size());

        System.out.println("*********************************************");
        System.out.println(hp.get("username"));

        if (hp.isEmpty()) {
            System.out.println("空");
        } else {
            System.out.println("非空");
        }

        if (hp.containsKey("username")) {
            System.out.println("key yes");
        }

        if (hp.containsValue("alex")) {
            System.out.println("value yes");
        }

        HashMap h1 = new HashMap();
        h1.put("username", 10);
        h1.put("email", "wangzhilei");


        hp.putAll(h1); // 如果有key重复，则会覆盖
        System.out.println(hp.get("username"));

        System.out.println("*******************************");

        for (Object item : hp.values()) {
            System.out.println(item);
        }

        hp.remove("username");

        System.out.println("*******************************");

        for (Object item : hp.values()) {
            System.out.println(item);
        }

        System.out.println("*******************************");
        System.out.println(hp.keySet());

        hp.clear();
        System.out.println("*******************************");

        for (Object item : hp.values()) {
            System.out.println(item);
        }

    }
}
