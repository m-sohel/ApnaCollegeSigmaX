public class FunctionOverloadPara {

    public static int multiply(int a, int b) {

        return a * b;

    }

    public static float multiply(float a, float b) {
        return a * b;

    }

    public static void main(String[] args) {

        System.out.println(multiply(5, 5));
        System.out.println(multiply(5.5f, 3.5f));

    }
}
