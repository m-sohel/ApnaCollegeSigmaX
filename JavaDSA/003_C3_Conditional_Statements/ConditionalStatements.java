import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();

        if (age>=18){

            System.out.println("you are an adult");
        }else if(age>=13 && age<=16) {

            System.out.println("you are a teenager");

        } else if (age<13) {

            System.out.println("you are a children");

        } else {

            System.out.println("you are not an adult");
        }

     sc.close();
    }
}
