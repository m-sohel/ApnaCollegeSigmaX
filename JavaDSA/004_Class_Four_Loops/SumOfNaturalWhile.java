import java.util.Scanner;

public class SumOfNaturalWhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a INT to calculate Sum :");
        int n = sc.nextInt();
        int sum=0;
        int i = 1; //iterater++
        while (i<=n) {

            sum+=i;  //magicLine --- [ sum = sum + i; ]
            i++; 
        }
         System.out.println("The Sum of the Natural NOs :"+sum);
    }
}
