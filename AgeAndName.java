import java.util.Scanner;

public class AgeAndName {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int a = sc.nextInt();
    sc.close();
    System.out.println("The name of the person is " + n + " and age is " + a);
  }
}
