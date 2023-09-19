import java.util.*;
public class RotateLeftAndRight{
  public static void rotateLeft(int[] arr, int k){
    int n =arr.length;
    if(n==0){
      return;
    }
    k=k%n;
    if(k>n){
      return;
    }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
     String dir = sc.next();
      sc.close();
      if(dir.equals("left")){
        rotateLeft(arr, k);
      } else{
        rotateRight(arr, k);
      }
}
}
}
