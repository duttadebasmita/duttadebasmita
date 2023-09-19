import java.util.*;

public class isSorted {

  public static int isSorted(int[] arr, int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) {
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(isSorted(arr, n));
  }
}
