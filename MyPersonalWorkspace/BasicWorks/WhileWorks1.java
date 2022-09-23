import java.util.Scanner;

public class WhileWorks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 : 1'den 100'e kadar çift sayıları ekrana yazdıran program

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        /*
         * Problem 2 : Negatif bir değer girilene kadar kullanıcıdan girişleri kabul
         * eden ve
         * girilen değerlerden tek sayıları toplayan program
         */

        int toplam = 0;
        int input;
        while (true) {
            System.out.println("Lütfen Bir Sayı Giriniz");
            input = sc.nextInt();

            if (input < 0) {
                System.out.println("Program Bitti Negatif Sayı Girdiniz");
                System.out.println("Tek Sayılar Toplamı : " + toplam);
                break;
            }
            if (input % 2 == 1) {
                toplam += input;

            }
        }

        /* Proglem 3 : Girilen sayıya kadar 2'nin kuvvetleri'ni bulan program */
        System.out.println("Lütfen Yeni bir sayı giriniz");
        int yenisayi;
        yenisayi = sc.nextInt();
        int k = 1;

        while(k<=yenisayi){
            System.out.println(k);
            k = k*2;
        }

        sc.close();

    }
}
