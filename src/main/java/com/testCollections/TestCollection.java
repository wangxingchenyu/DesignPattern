package testCollections;

import java.util.ArrayList;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/11 14:08
 * @Version 1.0
 */
public class TestCollection {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 10);
        Student s2 = new Student("Jerry", 20);
        Student s3 = new Student("Hustoy", 40);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("one");
        System.out.println(objects);
        objects.add(new Student("HusToy", 100));
        objects.remove(new Student("HusToy", 100));
        System.out.println(objects);

        /*
        List<Student> students = new ArrayList<>(); 两个对象是否相等 equals方法很重要
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Collections.sort(students);

        //  int searchResult = Collections.binarySearch(students, new Student("Jerry", 20));
        int alex = Collections.binarySearch(students, new Student("Jerry", 20), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //int num = this.age - o.age;
                int num = o1.getAge() - o2.getAge();
                int num1 = (num == 0 ? o1.getUsername().compareTo(o2.getUsername()) : num);
                return num1;
            }
        });

        System.out.println(alex);

         */

    }
}


class Student /*implements Comparable<Student> */ {
    private String username;
    private int age;

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
    }

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

    /*
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if (this.age == s.getAge()) {
                return true;
            }
        }
        return false;
    }
    */

    /*
    @Override
    public int compareTo(Student o) {
        int num = this.age - o.age;
        int num1 = (num == 0 ? this.username.compareTo(o.username) : num);
        return num1;
    }
     */


}
