public class Rectangle {
  private int width;
  private int height;

  public Rectangle() {}

  public Rectangle(int width, int height) {
    setWidth(width);
    setHeight(height);
  }

  public void setWidth(int width) {
    this.width = Math.abs(width);
  }

  public int getWidth() {
    return width;
  }

  public void setHeight(int height) {
    this.height = Math.abs(height);
  }

  public int getHeight() {
    return height;
  }

  public int getArea() {
    return getWidth() * getHeight();
  }

  public int getPerimeter() {
    return 2 * getWidth() + 2 * getHeight();
  }
}
