public class reverse {
  public static void main(String[] args) {
    int n = 1023;
    int m = n;
    int sum = 0;
    while (m != 0) {
      int digits = m % 10;
      sum = digits + sum * 10;
      m = m / 10;

    }
    System.out.println(sum);
  }

}
