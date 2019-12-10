package main.java.DesignPatter.iteratorPattern.v1;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/5 14:02
 * @Version 1.0
 */
public class LinkedList_ implements Collection_ {
    // 记录容器中的元素个数
    private int size = 0;
    Node head = null;
    Node tail = null;

    @Override
    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;
        if (head == null) {  // head 只有第一次赋值
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }

}



