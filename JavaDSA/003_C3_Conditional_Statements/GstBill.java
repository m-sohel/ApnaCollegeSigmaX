import java.util.*;
public class GstBill {

    public static void main(String[] args) {
//                 int $ = 24;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount of the pencil :");
        float pencil = sc.nextFloat();

        System.out.println("enter the amount of the pen :");
        float pen = sc.nextFloat();

        System.out.println("enter the amount of the eraser :");
        float eraser = sc.nextFloat();

        float total = pencil+pen+eraser;

        System.out.println("total amount : "+total);

        float gst = total *0.18f;

        System.out.println("total amount + inlusive of 18% GST : " + (gst+total));
   
        sc.close();;
    }
}
