/*Program Name: BineyTree
 *Program Purpose: Create a print a family tree using a Binary Tree
 Created / Edited by: jramrez */



class Main {
    public static void main(String[] args) {
      BineyTree famTree = new BineyTree("John");
      famTree.setLeft(new BineyTree("Jane", famTree));
      famTree.setRight(new BineyTree("Jack", famTree));
      famTree.getLeft().setLeft(new BineyTree("Jim", famTree.getLeft()));
      famTree.getLeft().setRight(new BineyTree("Jill", famTree.getLeft()));
      famTree.getRight().setLeft(new BineyTree("Jake", famTree.getRight()));
      famTree.readTreebyLevel();
    }
}