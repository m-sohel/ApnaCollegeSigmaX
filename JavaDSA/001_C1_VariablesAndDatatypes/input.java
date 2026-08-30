import java.util.*;

public class input {


    static void main() {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first name only : ");

        String name = sc.next();
        System.out.println("you entered : " + name);
        sc.close();
    }
}
