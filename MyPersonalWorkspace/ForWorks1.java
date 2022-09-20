import java.util.Scanner;

public class ForWorks1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sayı Asal mı değil mi ?
        // Sayı kendisine ve 1'e bölünüyorsa Asaldır

        System.out.println("Kontrol Etmek İstediğiniz Sayıyı Giriniz");
        int sayi = input.nextInt();
        boolean asal = true;

        for (int i = 2; i <= sayi;) {
            if(sayi % i == 0 || sayi % 3 == 0){
                asal = false;
                System.out.print("Girilen Sayı :" +sayi +" Asal Değildir");
                break;
            }
            if(asal){
                System.out.print("Girilen Sayı :" +sayi +" Asaldır");
            }
            break;
        }
        input.close();
    }
}
