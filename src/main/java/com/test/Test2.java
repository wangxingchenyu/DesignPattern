package test;

public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        int age = p1.getAge();
        System.out.println(age);
    }
}

class Person {
    private String name;
    private int age = 10;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        //在赋值之前先判断年龄是否合法
        if (age > 130 || age < 0) {
            this.age = 18;//不合法赋默认值18
        } else {
            this.age = age;//合法才能赋值给属性age
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}




