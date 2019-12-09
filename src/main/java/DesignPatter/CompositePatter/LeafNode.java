package main.java.DesignPatter.CompositePatter;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 13:09
 * @Version 1.0
 */
public class LeafNode implements Node {
    /**
     * 叶子
     */
    String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }
}
