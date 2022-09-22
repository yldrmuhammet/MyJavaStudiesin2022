import java.util.Scanner;

//Km Birim fiyat : 0.10$
// 12 Yaşından küçükse toplam fiyata %50 indirim
// 12 ve 24 yaş aralığında ise %10 indirim
// 65 yaş ve üzeri ise %30 indirim
// Gidiş dönüş alırsa %20 indirim
// Bu koşulları hesaplayan program

public class FlightTicketCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km, yas, tip;

        System.out.print("Lütfen Mesafe Giriniz :");
        km = input.nextInt();

        System.out.print("\nLütfen Yaşınızı Giriniz :");
        yas = input.nextInt();

        System.out.print("\nLütfen yolculuk tipinizi giriniz : (1=gidiş, 2=Gidiş/Dönüş");
        tip = input.nextInt();

        double normalFiyat, yasİndirimi, tip2indirimi, indirimFiyat;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            System.out.println("Girdiler Doğru !");
            normalFiyat = km * 0.1;
            if (yas < 12) {
                yasİndirimi = normalFiyat * 0.5; // 12 yaşından küçükler için indirim tutarı %50
                // normalFiyat = normalFiyat - yasİndirimi; // 12 Yaşından küçükler için km
                // başına normal fiyat
                System.out.println("\nBiletinize %50 indirim uygulanmıştır :)");
            } else if (yas >= 12 && yas <= 24) {
                yasİndirimi = normalFiyat * 0.10; // 12 ve 24 yaş aralığı için indirim tutarı
                // normalFiyat = normalFiyat - yasİndirimi; // 12 ve 24 yaş için indirimli
                // tutuar
                System.out.println("\nBiletinize %10 indirim uygulanmıştır :)");
            } else if (yas >= 65) {
                yasİndirimi = normalFiyat * 0.3; // 65 yaş ve üzeri %0 indirim tutarı
                // normalFiyat = normalFiyat * yasİndirimi; // 65 yaş ve üzeri indirimli fiyat
                // tutarı
                System.out.println("\nBiletinize %30 indirim uygulanmıştır :)");
            } else {
                yasİndirimi = 0; // 25-64 yaş arası indirim yok
            }
            normalFiyat -= yasİndirimi;
            indirimFiyat = km * 0.20;
            if (tip == 2) {
                tip2indirimi = indirimFiyat * 0.20;
                indirimFiyat -= ((indirimFiyat) - tip2indirimi);
                System.out.println("Sepet tutarınıza %20 extra indirim uygulanmıştır.");
            }

            System.out.print("\nBilet tutarı  :" + normalFiyat);
        }

        else {

            System.out.println("Girdiler Eksik veya Yanlış lütfen tekrar deneyiniz!!");

        }
        input.close();
    }
}
