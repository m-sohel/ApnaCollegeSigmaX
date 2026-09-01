public class FunOverParaTwo {

    public static int addNum(int a, int b){
        return a+b;
    } 

    public static int addNum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("the first method's sum : "+(addNum(5, 5)));
        System.out.println("the second method's sum : "+(addNum(5, 5, 5)));


    }

}
