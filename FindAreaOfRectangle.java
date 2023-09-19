import java.util.Scanner;

public class FindAreaOfRectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    System.out.println(l * b);
  }
}
