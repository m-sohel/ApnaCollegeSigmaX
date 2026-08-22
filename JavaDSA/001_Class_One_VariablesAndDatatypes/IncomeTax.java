import java.util.*;
public class IncomeTax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your annual (income in LPA) :");
        double income = sc.nextInt();
        double tax;
        if (income<=5){

            tax = income*0/100;
            System.out.println("the Income Tax percentage is 0% :" );
            System.out.println("The Income Tax amount is " + tax + " LPA");

        } else if (income>5 && income<10) {

            tax = income*20/100;
            System.out.println("the Income Tax percentage is 20%");
            System.out.println("The Income Tax amount is " + tax + " LPA");

        }else {
            tax = income*30/100;
            System.out.println("the Income Tax percentage is 30%");
            System.out.println("The Income Tax amount is " + tax + " LPA");
        }
    }
}
