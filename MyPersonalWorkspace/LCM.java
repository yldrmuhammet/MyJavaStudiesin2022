import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob=1, ekok;
        System.out.println("Sayı 1 giriniz");
        int s1 = input.nextInt();

        System.out.println("Sayi 2 Giriniz");
        int s2 = input.nextInt();

        int min = (s1 < s2) ? s1 : s2;

        for (int i = min; i > 0; i--) {
            if ((s1 % i == 0) && (s2 % i == 0)) {
                ebob = i;
                break;
            }
        }
        
        ekok = (s1*s2)/ebob;
        System.out.println(s1+" ve " +s2 + " + " + "Sayılarının EKOK'u :" +ekok);
        System.out.println(s1+" ve " +s2 + " + " + "Sayılarının EKOK'u :" +ebob);


        input.close();
    }
}
