import java.util.*;

public class BineyTree { //reused the linked list made from scratch
    private String name; 
    private BineyTree right;
    private BineyTree left;
    private BineyTree parent;

    public BineyTree(String n) {
      name = n;
      parent = null;
      right = null;
      left = null;
    }

    public BineyTree(String n, BineyTree p) {
      name = n;
      parent = p;
      right = null;
      left = null;
    }

    public Object getName() {
      return name;
    }

    public BineyTree getRight() {
      return right;
    }

    public BineyTree getLeft() {
      return left;
    }

    public BineyTree getParent() {
      return parent;
    }

    public void setRight(BineyTree node) {
      right = node;
    }

    public void setLeft(BineyTree node) {
      left = node;
    }

    public void readTreebyLevel() {
      LinkedList<BineyTree> q = new LinkedList<BineyTree>(); //majorly assisted by https://www.geeksforgeeks.org/level-order-tree-traversal/
      q.add(this); //adds the node it was called from to the queue
      while (q.isEmpty() == false) {
        BineyTree temp = q.remove();
        System.out.print(temp.getName() + " ");
        if (temp.getLeft() != null) { //If there is a left child, it is added to the queue
          q.add(temp.getLeft());
        }
        if (temp.getRight() != null) { //If there is a right child, it is added to the queue
          q.add(temp.getRight());
        }
      }
    }
}
