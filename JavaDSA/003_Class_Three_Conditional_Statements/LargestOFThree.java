import java.util.*;
public class LargestOFThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();

        System.out.println("enter third number");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("first number (a) is greatest : ");
        }else if(b>a && b>c) {

            System.out.println("second number (b) is greatest : ");

        } else if ((a==b && a==c) && (b==c && b==a) && (c==b && c==a)) {

            System.out.println("all the three numbers are equal");

        } else {
            System.out.println("three number (c) is greatest : ");
        }

        sc.close();
    }
}
