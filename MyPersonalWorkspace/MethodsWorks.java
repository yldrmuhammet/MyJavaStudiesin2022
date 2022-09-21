public class MethodsWorks {

    static int reback(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        return result;
    }

    public static void main(String[] args) {

        power(2, 3);

        // f(x) = (x + 2) * 6;
        f(4);
        System.out.println("İkinci Metot");
        f(6);

        power(2, 3);
        power(3, 2);

    }

    static void f(int x) {
        int result = (x + 2) * 6;
        System.out.println(result);
    }

    static void power(int number1, int number2) {
        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;

        }
        System.out.println("Cevap :" + result);

    }
}
