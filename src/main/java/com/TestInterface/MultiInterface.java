package TestInterface;

public class MultiInterface {
    public static void main(String[] args){
        ChildInterface child = new Person();
        child.work();
        child.eat();
        child.sleep();
    }
}

// 第一个父接口
interface ParentInterfaceOne{
   String username = "alex";
   void eat();
}

//第二个父接口
interface ParentInterfaceTwo{
   void sleep();
}

//子接口继承上面两个父接口
interface ChildInterface extends ParentInterfaceOne,ParentInterfaceTwo{
    void work();
}

//普通的类来实现上面的child接口
class Person implements ChildInterface{
    public void eat(){
        System.out.println("eating............");
    }

    public void sleep(){
        System.out.println("sleeping............");
    }

    public void work(){
       System.out.println("working..........");
    }
}





