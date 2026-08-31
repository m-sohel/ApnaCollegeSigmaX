import java.util.Scanner;

public class ParaFunction {

    // functions using parameters
    public static void calculateSum(int a, int b) { //parameters or the formal parameters
        //the value which get inputs in function definition is called parameters or the formal parameters

        int sum = a + b;
        System.out.println("the sum is : " + sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers to test the function : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();
        calculateSum(a, b); //arguments or the actual parameters (calling the function calculateSum(); )
        //the value which is passed to call the function is called arguments or the actual parameters

    }
}
