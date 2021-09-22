public class Power {
  public static int power(int num, int power) {
    if(power == 0) return 1;
    return num * power(num, power - 1);
  }
}