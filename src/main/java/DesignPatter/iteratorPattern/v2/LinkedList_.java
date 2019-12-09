package main.java.DesignPatter.iteratorPattern.v2;

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

    @Override
    public Iterator_ iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator_ {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Object next() {
            index++;
            if (tail.next != null){
                return tail.o;
            }
            return head;
        }

        public Object getObject(Node node, int i) {
            if (i < size) {
                return node.o;
            }
            return node.o;
        }
    }

    private class Node {
        Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "o=" + o +
                    ", next=" + next +
                    '}';
        }
    }

}



