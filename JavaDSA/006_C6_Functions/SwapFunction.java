public class SwapFunction {

    public static void swap(int a, int b){
      int temp=a; //adding a's data in temp so "a" is empty
      a=b; //adding b's data in an empty "a"
      b=temp; //adding temp's data in an empty "b"

       System.out.println("the value of 'a' after swapping : "+a);
       System.out.println("the value of 'b' after swapping : "+b);
    }
     
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a, b);
    }
}
