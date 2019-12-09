package TestCloseOpen;

import java.util.Date;

public class TestCloseOpen {
    public static void main(String[] args) {
        //. Integer integer = Integer.valueOf(100);
        // int i = integer.intValue();
        //List<String> lists = new ArrayList<>();
        //lists.add("one");
        //lists.add("two");
        //lists.add("three");
        //lists.add("four");

        // List<String> strings = lists.subList(1, 2);
        // System.out.println(strings);
        //lists.add(1,"new Value");
        //System.out.println(lists);

        // int one = lists.indexOf("one");
        // System.out.println(one);

        /*
        Iterator<String> iterator = lists.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }
         */

        //String s = "1,3;2,3,4;5";


        /*
        String[] split = s.split(";");
        double[][] d;
        d = new double[split.length][];
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(",");
            double[] doubles = new double[split1.length];
            for (int j = 0; j < split1.length; j++) {
                doubles[j]  = Double.parseDouble(split1[j]);
            }
            d[i] = doubles;
        }

        for (double[] doubles : d) {
            for (double aDouble : doubles) {
               System.out.print(aDouble+" ");
            }
            System.out.println();
        }

         */

        //System.out.println(2.00f-1.10f);  // 0.8999999999999999

        Object[] obj  = {"one",1,new Date()};


    }
}

abstract class Animal {
    abstract void eat() throws ClassNotFoundException;
}

class Dog extends Animal {

    @Override
    public void eat() throws ClassNotFoundException {
        System.out.println("dog is eating.........");
        Class<?> aClass = Class.forName("cone.te");
    }

    public void yell() {
        System.out.println("dog is yelling............");
    }

}


class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.........");
    }

    public void catchMouse() {
        System.out.println("Cat can catch the mouse which lazy........");
    }

}


class Name implements Comparable {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}



