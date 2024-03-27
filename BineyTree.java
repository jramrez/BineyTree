
public class BineyTree {
    private String name; 
    private BineyTree rightNode;
    private BineyTree leftNode;

    public BineyTree(String n) {
        name = n;
        rightNode = null;
        leftNode = null;
    }

    public Object getThisNode() {
        return name;
    }

    public BineyTree getRight() {
        return rightNode;
    }

    public BineyTree getLeft() {
        return leftNode;
    }

    public void setRight(BineyTree node) {
        rightNode = node;
    }

    public void setLeft(BineyTree node) {
        leftNode = node;
    }
}
