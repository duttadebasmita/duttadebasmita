import java.io.*;
import java.util.*;

//brute force
class Main {

  public static int largestElement(int[] arr, int n) {
    Arrays.sort(arr);
    return arr[n - 1];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(largestElement(arr, n));
  }
}

//optimal

class Main {

  public static int largestElement(int[] arr, int n) {
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
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
    System.out.println(largestElement(arr, n));
  }
}
