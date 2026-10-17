public class ReverseArray {

    public static void reverseArray(int numbers[]){

        int start =0, end = numbers.length-1;
        while (start<end) {

            //swap
            int temp = numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
            
        }
    }
    
    public static void main(String[] args) {
        int numbers []={2,6,8,4,79,56,6,3,21,6,5};
        
        reverseArray(numbers);
        for(int i = 0; i<numbers.length; i++){
          System.out.print(numbers[i]+ "  ");
        }
        System.out.println();
    }

}
