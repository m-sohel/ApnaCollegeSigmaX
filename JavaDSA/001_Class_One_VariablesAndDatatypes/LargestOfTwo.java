import java.util.*;
public class LargestOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("first number is greater : ");
        }else if(a==b) {

            System.out.println("both numbers are equal : ");

        }else {
            System.out.println("second number is greater : ");
        }
    }
}
