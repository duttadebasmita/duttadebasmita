import java.util.*;

public class NumberAverage {

  public static int average(int[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      sum += arr[i];
    }
    return sum / n;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(average(arr, n));
  }
}
