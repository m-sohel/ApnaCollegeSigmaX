import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();

     String status = (age >= 18) ? "Adult" : "not adult";

     System.out.println(status);
    }
}
