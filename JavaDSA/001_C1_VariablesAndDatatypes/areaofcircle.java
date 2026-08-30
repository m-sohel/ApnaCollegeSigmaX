import java.util.*;
public class areaofcircle {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle : ");

        float radius = sc.nextFloat();
        float area = 3.14f*radius*radius;

        System.out.println("area of the circle is : " + area);
        sc.close();
    }
}
