import java.util.Scanner;

public class CreateArray {
    
    public static void main(String[] args) {
        
        int marks [] = new int[10];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths

        System.out.println("physics marks : "+marks[0]);
        System.out.println("chemistry marks : "+marks[1]);
        System.out.println("mathematics marks : "+marks[2]);

        marks [0] = 100;
        System.out.println("physics marks : "+marks[0]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("final percentages %"+percentage);

        System.out.println("the length of the array is : "+marks.length);

        sc.close();
    }
}
