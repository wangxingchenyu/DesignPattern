package main.java.DesignPatter.CompositePatter;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 13:13
 * @Version 1.0
 */
public class TestCompositePattern {
    /**
     * 树状模式，遍历tree
     * @param args
     */
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode childOne = new BranchNode("childOne");
        BranchNode childTwo = new BranchNode("childTwo");
        BranchNode childTwo_one = new BranchNode("childThree");
        LeafNode leafOne = new LeafNode("leafOne");
        LeafNode leafTwo = new LeafNode("leafTwo");

        childOne.addNode(leafOne);
        childTwo.addNode(leafTwo);
        childTwo.addNode(childTwo_one);
        root.addNode(childOne).addNode(childTwo);

        tree(root,0);
    }


    public static void tree(Node node,int depth) {
        for (int i = 0; i < depth; i++) System.out.print("--");
        node.p();
        if (node instanceof BranchNode) {
            for (Node branchNode : ((BranchNode) node).nodes) {
                tree(branchNode,depth+1);
            }
        }
    }

}
