import java.util.*;
public class Switch {

    public static void main() {

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the first number");
        int a = sc.nextInt();

        System.out.println("select the operator (+, -, *, /, %) ");
        char opr = sc.next().charAt(0);

        System.out.println("enter the second number");
        int b = sc.nextInt();

        switch (opr){
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            case '%':
                System.out.println(a%b);
                break;

            default:
                System.out.println("invalid choice");
        }

    }
}
