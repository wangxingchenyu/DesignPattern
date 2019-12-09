package TestBase;

public class TestZhuiSu {
    public static void main(String[] args){
        System.out.println("starting..........");
        new Child_Class();
    }
}

class Father_Class{
    public Father_Class(){
        System.out.println("father_class");
    }

    static {
        System.out.println("father_static");
    }

}

class Child_Class extends Father_Class{
    public Child_Class(){
        System.out.println("child_class");
    }

    static {
        System.out.println("child_static");
    }
}


/*
* father
* children
*
*/