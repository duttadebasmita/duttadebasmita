import java.util.*;

public class LinearSearch {

  public static int findElement(int[] arr, int n, int target) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();
    sc.close();
    System.out.println(findElement(arr, n, target));
  }
}
