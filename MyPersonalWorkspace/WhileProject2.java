import java.util.Scanner;
public class WhileProject2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        // Örnek 1 Faktöriyel Hesaplama

        System.out.println("Faktöriyel sayısını giriniz");
        int f = input.nextInt();
        int sonuc = 1;

        while(f > 0 ){
            sonuc *= f;
            f--;
        }
        System.out.println("Fakoriyel Hesabınız : " +sonuc);


        // Örnek 2 Harmonik Sayılar Hesaplama
        System.out.println("Harmonik Sayı Değerini Giriniz ");
        double h = input.nextDouble();
        double harmonic = 0.0;
        while(h > 0){
            harmonic += (1/h);
            h--;
        }
        System.out.println("Harmonik Sayı Hesabınız :" +harmonic);


        // Örnek 3 Yıldızlar ile Üçgen Yapma

        System.out.println("Kaç Yıldızlı bir dizi İstiyorsunuz");
        int star = input.nextInt();
        int i = 1;
        while( i <= star){
            int k = 1;
            while (k<=i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

        // Örnek 4 Üslü Sayı Hesaplama


        System.out.println("Üssü Alınacak olan Sayı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("Üs olacak Sayı Değerini Giriniz :");
        int sayi2 = input.nextInt();
        int i1=1;
        int sonuc1 = 1;

        while(i1<=sayi2){
            sonuc1 *= sayi1;
            i++;
            
            
        }
        System.out.println("Sonuc :" +sonuc1);



        input.close();
    }
}
