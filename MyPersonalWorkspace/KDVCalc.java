import java.util.Scanner;

// Hedef 3 farklı ürün verisi almak
// ALınan 3 üzerine kdv eklemek
// Toplam tutarı hesaplayarak yazdırmak

public class KDVCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float urun1, urun2, urun3;

        System.out.println("SEPET"                      );

        System.out.println("Birinci Ürün Fiyatı :"      );
        urun1 = input.nextFloat();

        System.out.println("İkinci Ürün Fiyatı  :"      );
        urun2 = input.nextFloat();

        System.out.println("Üçücü  Ürün Fiyatı  :"      );
        urun3 = input.nextFloat();

        int toplam = (int) ((urun1) + (urun2) + (urun3)    );
        System.out.println("Toplam Ürün Tutarı :" + toplam );

        int kdv = (int) ((urun1*0.18) + (urun2*0.18) + (urun3*0.18));
        System.out.println("KDV Tutarı: " +kdv);

        int tspet = (int) (toplam + kdv);
        System.out.println("KDV Dahil Toplam Sepet Tutarı :" +tspet  );

        input.close();

           
    }
    
}
