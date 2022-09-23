import java.util.Scanner;

public class MounthWorks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir Değer Giriniz");
        int amount = input.nextInt();

        int i = 10, k1, k2, k3, n1, n2, n3;

        if (amount % i == 0) {
            k1 = amount * 10 / 100;
            n1 = amount - k1;
            k2 = n1 * 10 / 100;
            n2 = n1 - k2;
            k3 = n2 * 10 / 100;
            n3 = n2 - k3;
        } else {
            k1 = amount % i;
            n1 = amount - k1;
            k2 = n1 % i;
            n2 = n1 - k2;
            k3 = n2 % i;
            n3 = n2 - k3;

        }
        System.out.println(n3);
        input.close();
    }
}
