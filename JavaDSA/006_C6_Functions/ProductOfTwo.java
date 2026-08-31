public class ProductOfTwo {

    public static int multiply(int a, int b){

        int produt = a*b;
        // System.out.println(produt);
        return produt;
    }
    
    public static void main(String[] args) {
        int prod = multiply(5, 6);
        System.out.println("product of a & b is: " + prod);
    }
}
