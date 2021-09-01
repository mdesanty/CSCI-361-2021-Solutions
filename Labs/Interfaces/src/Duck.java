public class Duck implements IAnimal {
  private String name;

  public Duck(String name) {
    this.name = name;
  }

  @Override
  public String makeSound() {
    return name + " says: quack quack quack!";
  }
}