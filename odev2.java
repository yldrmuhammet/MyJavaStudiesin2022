import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input GAZİ ÖDEV 2");

        // Klavyeden girilen n sayısına göre;
        // 1’den n’e kadar tamsayıların toplamını(tl)
        // 1’den n’e kadar tek tamsayıların toplamını(t2)
        // 2’den n’e kadar çift sayıların toplamını(t3)
        // Hesaplayan ve ekrana yazdıran programı tasarlayarak;
        // Akış Diyagramı ve Sözde Kod
        // Olarak ifade ediniz.

        System.out.println("Lütfen bir tam sayı giriniz");

        // 1'den n'e kadar tam sayı toplamı
        int sayi1 = input.nextInt();
        int sayitoplam1 = 0;
        int i1 = 1;

        for (i1 = 1; i1 < sayi1; ++i1) {
            sayitoplam1 += i1;
            System.out.println("Tam Sayıların Toplamı  :" + sayitoplam1);
        }

        // 1’den n’e kadar tek tamsayıların toplamını(t2)

        System.out.println("Lütfen Bir Tamsayı Giriniz :");

        int sayi2 = input.nextInt();
        int sayitoplam2 = 0;
        int i2 = 1;

        for (i2 = 1; i2 < sayi2; ++i2)
            if (i2 % 2 != 0) {
                sayitoplam2 += i2;
                System.out.println("Tek Tam sayılar Toplamı  : " + sayitoplam2);
            }
        // 2’den n’e kadar çift sayıların toplamını(t3)

        System.out.println("Lütfen Bir Tam sayı Giriniz :");

        int sayi3 = input.nextInt();
        int sayitoplam3 = 0;
        int i3 = 2;

        for (i3 = 2; i3 <= sayi3; i3++) {
            if (i3 % 2 == 0) {
                sayitoplam3 = sayitoplam3 + i3;

                System.out.println("Çift Tam Sayıların Toplamı : " + sayitoplam3);
            }
        }

        input.close();
    }

}
