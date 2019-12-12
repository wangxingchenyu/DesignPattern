package TestString_2;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        System.out.println("请输入你的名字:");
        Scanner san = new Scanner(System.in);
        String val = san.nextLine();
        System.out.println(val);
    }
}
