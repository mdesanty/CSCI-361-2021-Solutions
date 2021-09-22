public class Main {
  public static void main(String[] args) {
    Main main = new Main();

    main.testPower();
    System.out.println();

    main.testFibonacci();
  }

  private void testPower() {
    System.out.println("Power 4 ^ 1: " + Power.power(4, 1));
    System.out.println("Power 4 ^ 2: " + Power.power(4, 2));
    System.out.println("Power 4 ^ 3: " + Power.power(4, 3));
    System.out.println("Power 4 ^ 4: " + Power.power(4, 4));
  }

  private void testFibonacci() {
    for(int i = 0; i < 10; i++) {
      System.out.println("Fibonacci value at position " + i + ": " + Fibonacci.valueAtPosition(i));
    }
  }
}