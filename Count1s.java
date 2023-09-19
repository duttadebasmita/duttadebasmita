import java.util.*;

public class Count1s {

  public static int countOnes(int[] arr, int n) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        count++;
      } else {
        count = 0;
      }
      max = Math.max(max, count);
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(countOnes(arr, n));
  }
}
