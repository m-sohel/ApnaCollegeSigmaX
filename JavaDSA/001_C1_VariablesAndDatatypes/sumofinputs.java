import java.util.*;
public class sumofinputs {


    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("lets do sum of two numbers : ");

        System.out.println("enter the first number to Sum :");
         int first_number = sc.nextInt();

        System.out.println("enter the second number to Sum :");
        int second_number = sc.nextInt();

        System.out.println("your sum of first and the second number is : "+ (first_number+second_number));
    }
}
