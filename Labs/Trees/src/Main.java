import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
  /* Expected output:
   *
   * [4, 2, 5, 1, 3]
   * [1, 2, 4, 5, 3]
   * [4, 5, 2, 3, 1]
   * [3, 1, 5, 4, 2]
   * [1, 2, 3, 4, 5]
   */
  public static void main(String[] args)
  {
    BinaryTree<String> one = new BinaryTree<String>("1");
    BinaryTree<String> two = new BinaryTree<String>("2");
    BinaryTree<String> three = new BinaryTree<String>("3");
    BinaryTree<String> four = new BinaryTree<String>("4");
    BinaryTree<String> five = new BinaryTree<String>("5");

    one.setLeft(two);
    two.setLeft(four);
    two.setRight(five);

    one.setRight(three);

    List<String> values = one.inOrder();
    System.out.println(values);

    values = one.preOrder();
    System.out.println(values);

    values = one.postOrder();
    System.out.println(values);

    List<BinaryTree<String>> trees = new ArrayList<BinaryTree<String>>();
    trees.add(three);
    trees.add(one);
    trees.add(five);
    trees.add(four);
    trees.add(two);

    System.out.println(trees);

    Collections.sort(trees);
    System.out.println(trees);
  }
}