package TestBase;

public class TestEquals2 {
    public static void main(String[] args) {
        System.out.println("测试相等");
        Car c1 = new Car(10);
        Car c2 = new Car(10);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}

class Car {
    int id;

    public static void main(String[] args) {
        System.out.println();
    }

    public Car(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Car) {
                Car c = (Car) obj; //必须要转为此类对象，才能找到这个类的属性
                if (c.id == this.id) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}


