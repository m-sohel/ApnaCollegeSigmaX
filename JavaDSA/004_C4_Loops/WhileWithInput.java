import java.util.Scanner;

public class WhileWithInput {

    public static void main(String[] args) {
        int counter = 1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num  = sc.nextInt();

        while (counter<=num){
            System.out.print(counter);
            System.out.print("   ");
            counter++;
        }
    }
    
}
 