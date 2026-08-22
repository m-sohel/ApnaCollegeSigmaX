import java.util.*;
public class PracticeQsC1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number for the average. : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number for the average. : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number for the average. : ");
        int c = sc.nextInt();

        double average = (a+b+c)/3;

        System.out.println("the average of the three numbers : "+average);

        sc.close();
    }
}
