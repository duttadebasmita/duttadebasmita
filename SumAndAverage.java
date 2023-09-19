import java.util.*;

public class SumAndAverage {

  public static void avg(int[] temp, int sum) {}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int temp[] = new int[7];
    System.out.println("Enter 7 days temperature");
    for (int i = 0; i <= 6; i++) {
      temp[i] = sc.nextInt();
      sum = sum + temp[i];
    }
    System.out.println("avg is " + (sum / 7));
  }
}
