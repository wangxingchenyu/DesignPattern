package TestBase;

public class TestClassOne {
     String username = "alex";
    public static void main(String[] args) {
        System.out.println("testClassOne");
    }
}

class Lei extends TestClassOne{
    Lei(){
        System.out.println("lei");
        System.out.println(username);
    }
}



/*
 * public 全开放
 * private 只有类自身
 * protected (子类，与包，包就相当于一个业务类文件拆分成多个.java文件)
 * default
 * */