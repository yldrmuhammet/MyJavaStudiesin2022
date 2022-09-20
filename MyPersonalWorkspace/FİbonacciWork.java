import java.util.Scanner;

public class FİbonacciWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Finbonacci Serisi : 0 , 1 , 1 ,2,3,5,8,13,21...

        System.out.println("Bir Sayı Giriniz :");
        int sayi = input.nextInt();

        int s1 = 0;
        int s2 = 1;
        int toplam = 0;

        System.out.println(input + "Sayısının Fibonacci Serisi :");
        for (int i = 1; i <= sayi; i++) {
            System.out.print(s1 + " , ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;

        }

        input.close();
    }
}
