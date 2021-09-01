public class Main {
  public static void main(String[] args) {
    Main main = new Main();

    main.testPig();
    main.testDuck();

    /* Expected output:
     *
     * Piggy says: oink oink oink!
     * Ducky says: quack quack quack!
     */
  }

  private void testPig() {
    Pig piggy = new Pig("Piggy");
    System.out.println(piggy.makeSound());
  }

  private void testDuck() {
    Duck ducky = new Duck("Ducky");
    System.out.println(ducky.makeSound());
  }
}