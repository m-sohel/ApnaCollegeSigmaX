import java.util.*;
public class AreaOfSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the height of the square");
        int height = sc.nextInt();

        System.out.println("enter the width of the square");
        int width = sc.nextInt();

        sc.close();

        System.out.println("The area of square is : " + (height*width));
    }
}
