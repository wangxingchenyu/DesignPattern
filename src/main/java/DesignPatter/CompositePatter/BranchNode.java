package main.java.DesignPatter.CompositePatter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 13:11
 * @Version 1.0
 */
public class BranchNode implements Node {
    String name;
    List<Node> nodes = new ArrayList();

    public BranchNode(String name) {
        this.name = name;
    }

    public BranchNode addNode(Node node) {
        this.nodes.add(node);
        return this;
    }


    @Override
    public void p() {
        System.out.println(name);
    }
}
