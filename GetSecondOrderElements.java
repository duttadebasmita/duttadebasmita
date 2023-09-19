import java.util.*;

public class GetSecondOrderElements {

  public static void getElements(int arr[], int n) {
    int small = Integer.MAX_VALUE;
    int second_small = Integer.MAX_VALUE;
    if (n < 2) {
      System.out.println(-2);
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] < small) {
        second_small = small;
        small = arr[i];
      } else if (arr[i] < second_small && arr[i] != small) {
        second_small = arr[i];
      }
    }
    int large = Integer.MIN_VALUE;
    int second_large = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (arr[i] > large) {
        second_large = large;
        large = arr[i];
      } else if (arr[i] > second_large && arr[i] != large) {
        second_large = arr[i];
      }
    }
    System.out.println(second_small);
    System.out.println(second_large);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    getElements(arr, n);
  }
}
