package TestCollect;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * 1)传入什么类型就是什么类型
 * 2)将结果传递给函数
 * <p>
 * 数组与链表的区别 (数组查询效率强，由于连在一起,但是修改，删除，插入，效率太慢，因为元素位置要移位)
 * 链表，查询慢，因为每个元素中保存着前一个对象的与下一个对象 ，但是修改比较快，直接在相关的位置接入就可以了，不需要移位
 */


public class TestCollection_01 {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(1);
        l.add("ne");

        // 获取
        System.out.println(l.get(0));

        // 判断是否包含
        System.out.println(l.contains("ne"));

        // 长度
        System.out.println(l.size());

        // 获取一个元素索引
        System.out.println(l.indexOf("ne"));

        // 移除一个元素
        System.out.println(l.remove("ne"));

        // 判断是否为空
        System.out.println(l.isEmpty());

        // 清空
        l.clear();

        // 将另外容器里面数据合并到一个容器中
        l.addAll(l);

        // 转换为数组
        l.toArray();

        // 判断一个容器是否判断C容器的所有元素
        System.out.println(l.containsAll(l));

        // 从l容器时面将c容器的所有的数据给移除
        l.removeAll(l);









        // 获取链表长度
        System.out.println(l.size());


        // 第一个泛型对象
        MyCollection<Integer> mc = new MyCollection<Integer>();
        mc.set(112, 0);
        mc.set(55, 1);
        System.out.println(mc.get(0));
        MyCollection<String> m = new MyCollection<String>();
        System.out.println("*******************************************************");

        // 第二个泛型对象
        m.set("hello", 0);
        m.set("world", 1);
        System.out.println(m.get(0));
        System.out.println(m.get(1));

        System.out.println("****************** 泛型Arraylist *************************");
        fanType();
        System.out.println("******************** 自定义泛型  ***********************************");
        fanType2();
        fanType3();
    }


    public static void fanType() {
        List list = new ArrayList();
        list.add("aaa");
        list.add(11);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

    public static void fanType2() {
        MyCollection c = new MyCollection();
        c.set(100, 0);
        c.set("hello", 1);
        System.out.println(c.get(0));
        System.out.println(c.get(1));
    }

    public static void fanType3() {
        List<String> l = new ArrayList<String>();
        l.add(0, "one");
        l.add(1, "two");
        System.out.println(l.get(0));
        System.out.println(l.get(1));
    }
}

class MyCollection<E> {// E:表示泛型;如果在声明的时候指定数据的类型，则传入的值必有在是这个类型，如果不传的话，则可以是任何的数据类型
    Object[] objs = new Object[5];

    // 获取数据
    public E get(int index) {// E:表示泛型;
        return (E) objs[index];
    }

    // 设置数据
    public void set(E e, int index) {// E:表示泛型;
        objs[index] = e;
    }
}



