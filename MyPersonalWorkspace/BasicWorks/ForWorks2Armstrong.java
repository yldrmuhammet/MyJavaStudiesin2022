
public class ForWorks2Armstrong {
    public static void main(String[] args) {

        // 153 = (1*1*1)+(5*5*5)+(3*3*3)
        // Armstrong Sayıları verilen sayının her bir basamağının küpünün toplamına
        // eşittir.

        /*
         * Sonuç Değerleri Bilinen Armstrong sayılar :
         * 153
         * 370
         * 371
         * 407
         */

        System.out.println("Armstrong Sayısı Konrtolü İçin Değer Giriniz :");

        int i, k1, k2, k3, temp, toplam;

        for (i = 100; i <= 999; i++) {
            temp = i;

            k1 = temp % 10; // Birler Basamağı
            temp /= 10;

            k2 = temp % 10; // Onlar Basamağı
            temp /= 10;

            k3 = temp % 10; // Yüzler Basamağı
            temp /= 10;

            toplam = (k1 * k1 * k1) + (k2 * k2 * k2) + (k3 * k3 * k3);

            if (toplam == i) {
                System.out.println(i + " Bir Armstrong Sayısıdır");
            }
        }

    }
}
