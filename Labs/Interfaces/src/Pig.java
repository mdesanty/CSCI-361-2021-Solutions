public class Pig implements IAnimal {
  private String name;

  public Pig(String name) {
    this.name = name;
  }

  @Override
  public String makeSound() {
    return name + " says: oink oink oink!";
  }
}