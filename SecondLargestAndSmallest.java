// import java.io.*;
// import java.util.*;

// public class SecondLargestAndSmallest {

//   public static void getElements(int[] arr, int n) {
//     if (n == 0 || n == 1) {
//       System.out.println(-1);
//     }
//     Arrays.sort(arr);
//     int secondSmallet = arr[1];
//     int secondLargest = arr[n - 2];

//     System.out.println(secondLargest);
//     System.out.println(secondSmallet);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt(); //arraysize
//     int[] arr = new int[n]; //memoryallocation
//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt(); //inputarray
//     }
//     sc.close();
//     getElements(arr, n);
//   }
// }
//optimal
