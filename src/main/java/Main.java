/*Program Name: BineyTree
 *Program Purpose: Create a print a family tree using a Binary Tree
 Created / Edited by: jramrez */

import java.util.*;

class Main {
    public static void main(String[] args) {
      BineyTree famTree = new BineyTree("John");
      BineyTree current = famTree;
      Scanner scan = new Scanner(System.in);
      while (true) {
        System.out.println("Add family member, go back, or advance? (a/b/c)");
        String input = scan.nextLine();
        if (input.equals("a")) {
          System.out.println("What is the name of the next family member?");
          String member = scan.nextLine();
          if (member.equals("")) {
            System.out.println("Invalid input");
            continue;
          }
          System.out.println("Father or Mother?");
          String relation = scan.nextLine();
          if (relation.equals("Father")) {
            current.setLeft(new BineyTree(member, current));
            current = current.getLeft();
          }
          else if (relation.equals("Mother")) {
            current.setRight(new BineyTree(member, current));
            current = current.getRight();
          }
          else {
            System.out.println("Invalid input");
            continue;
          }
        }
        else if (input.equals("b")) {
          if (current.getParent() == null) {
            break;
          }
          current = current.getParent();
        }
        else if (input.equals("c")) {
          System.out.println("to Father or Mother?");
          input = scan.nextLine();
          if (input.equals("Father")) {
            current = current.getLeft();
          }
          else if (input.equals("Mother")) {
            current = current.getRight();
          }
          else {
            System.out.println("Invalid input");
            continue;
          }
        }
      }
      famTree.readTreebyLevel();
      scan.close();
    }
}