package main.java.DesignPatter.iteratorPattern.v1;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/5 13:42
 * @Version 1.0 实现arrayList的功能有，往时面追加值，返回长度 (ArrayList_ 基于数组来实现)
 */
public class ArrayList_ implements Collection_ {
    Object[] objs = new Object[10];
    int index = 0;

    @Override
    public void add(Object o) {
        if (index == objs.length) {
            Object[] nobjs = new Object[objs.length * 2];
            System.arraycopy(objs, 0, nobjs, 0, objs.length);
            objs = nobjs;
        }
        objs[index] = o;
        index++;
    }

    @Override
    public int size() {
        return this.index;
    }
}
