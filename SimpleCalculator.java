import java.util.Scanner;

// Switch Case yapısını kullanarak basit bir hesap makinesi yapımı

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;
        
        System.out.println("\n Lütfen yapmak istediğini İşlemi Seçiniz" );
        System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi \n3- Çarpma İşlemi \n4- Bölme İşlemi \n5- Mod ALma İşlemi.");
        System.out.println("Seçiminizi Giriniz :");

        int secim = input.nextInt();

        System.out.println("İlk Sayıyı Giriniz :"   );
        sayi1 = input.nextInt();
        
        System.out.println("İkinci Sayıyı Giriniz :");
        sayi2 = input.nextInt();
    
        switch (secim){

        case 1:
        System.out.println("Sonuç : " +((float) sayi1 + sayi2));
        break;

        case 2:
        System.out.println("Sonuç : " +((float) sayi1 - sayi2));
        break;
        
        case 3:
        System.out.println("Sonuç : " +((float) sayi1 * sayi2));
        break;
        
        case 4:
        System.out.println("Sonuç : " +((float) sayi1 / sayi2));
        break;

        case 5:
        System.out.println("Sonuç : " +((float) sayi1 % sayi2));
        break;

        default:
        System.out.println("Geçerli Olmayan Bir Sayı Girdiniz !!");

        }
        
        input.close();
    }
    
}
