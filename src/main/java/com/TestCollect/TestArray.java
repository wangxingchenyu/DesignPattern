package TestCollect;

import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<Integer>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.stream().forEach(x -> System.out.println(x));
    }
}
