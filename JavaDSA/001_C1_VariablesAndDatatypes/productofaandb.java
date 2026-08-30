import java.util.*;
public class productofaandb {


    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("lets calculate the product /n of two numbers : ");

        System.out.println("enter the first number to Product :");
        int first_number = sc.nextInt();

        System.out.println("enter the second number to Product :");
        int second_number = sc.nextInt();

        System.out.println("your sum of first and the second number is : "+ (first_number*second_number));
        sc.close();
    }
}
