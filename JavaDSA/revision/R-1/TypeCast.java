import java.util.*;
public class TypeCast {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a float value to convert in an integer");
        float value = sc.nextFloat();
        int valueconversion = (int) value;

        System.out.println("the converted value is : " + valueconversion);

        sc.close();
    }
    
    
}
