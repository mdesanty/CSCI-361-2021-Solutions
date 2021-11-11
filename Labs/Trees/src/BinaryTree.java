import java.util.List;
import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> implements Comparable<BinaryTree<T>>
{
  private String value;
  private BinaryTree<T> left;
  private BinaryTree<T> right;

  public BinaryTree(String value)
  {
    this.value = value;
    left = null;
    right = null;
  }

  public BinaryTree(String value, BinaryTree<T> left, BinaryTree<T> right)
  {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public BinaryTree<T> getLeft()
  {
    return left;
  }

  public BinaryTree<T> getRight()
  {
    return right;
  }

  public String getValue()
  {
    return value;
  }

  public void setLeft(BinaryTree<T> left)
  {
    this.left = left;
  }

  public void setRight(BinaryTree<T> right)
  {
    this.right = right;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public List<String> inOrder()
  {
    List<String> values = new ArrayList<String>();
    _inOrder(this, values);

    return values;
  }

  private void _inOrder(BinaryTree<T> tree, List<String> values)
  {
    if (tree.getLeft() != null)
      _inOrder(tree.getLeft(), values);

    values.add(tree.getValue());

    if (tree.getRight() != null)
      _inOrder(tree.getRight(), values);
  }

  public List<String> preOrder()
  {
    List<String> values = new ArrayList<String>();
    _preOrder(this, values);

    return values;
  }

  private void _preOrder(BinaryTree<T> tree, List<String> values)
  {
    values.add(tree.getValue());

    if (tree.getLeft() != null)
      _preOrder(tree.getLeft(), values);

    if (tree.getRight() != null)
      _preOrder(tree.getRight(), values);
  }

  public List<String> postOrder()
  {
    List<String> values = new ArrayList<String>();
    _postOrder(this, values);

    return values;
  }

  private void _postOrder(BinaryTree<T> tree, List<String> values)
  {
    if (tree.getLeft() != null)
      _postOrder(tree.getLeft(), values);

    if (tree.getRight() != null)
      _postOrder(tree.getRight(), values);

    values.add(tree.getValue());
  }

  @Override
  public int compareTo(BinaryTree<T> other)
  {
    return getValue().compareTo(other.getValue());
  }

  @Override
  public String toString()
  {
    return getValue().toString();
  }
}