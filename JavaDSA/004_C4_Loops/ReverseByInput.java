import java.util.Scanner;

public class ReverseByInput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to reverse ");
        int num = sc.nextInt();
        
        System.out.println("the reversed digit is : ");
        while (num>0) {

            int lastDigit = num%10;

            System.out.print(lastDigit + " ");

            num/=10;
            
        }
        System.out.println();
        sc.close();

    }
}
