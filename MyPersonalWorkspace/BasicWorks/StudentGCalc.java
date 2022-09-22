import java.util.Scanner;

// Bartın Üniversitesi Not Sistemi Örneği %10 quiz %30 Vize ve % 60 Final Puanı
// 45-50 Arası Sorumlu Geçer
// 50 Üstü Geçer
// 45 Altı Kalır


public class StudentGCalc {
    public static void main(String[] args) {
        int quiz1 , vize , sonsinav;
        double ortalama;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quiz 1 Notunu Giriniz :"     );
        quiz1 = input.nextInt();

        System.out.println("Vize Notunu Giriniz   :"     );
        vize = input.nextInt();

        System.out.println("Final  Notunu Giriniz :"     );
        sonsinav = input.nextInt();

        ortalama = (quiz1*0.1) +  (vize * 0.4) + (sonsinav * 0.6);
        System.out.println("Not Ortalamanız :");

        if (ortalama >= 90) {
            System.out.println("AA ile Başarı ile geçtiniz ! " + ortalama);
        } 
        else if (ortalama >= 85) {
            System.out.println("BA ile Başarı ile geçtiniz ! " + ortalama);
        }
        else if (ortalama >= 70) {
            System.out.println("BB ile Başarı ile geçtiniz ! " + ortalama);
        }
        else if (ortalama >= 65) {
            System.out.println("CB ile Başarı ile geçtiniz ! " + ortalama);
        }
        else if (ortalama >= 55) {
            System.out.println("CC ile Başarı ile geçtiniz ! " + ortalama);
        }
        else if (ortalama >= 50) {
            System.out.println("DC ile Başarı ile geçtiniz ! " + ortalama);
        }
        else if (ortalama > 45) {
            System.out.println("DC ile Başarı ile geçtiniz ! " + ortalama);
        }
        else if (ortalama < 45 ) {
            System.out.println("FF ile Dersten Kaldınız " + ortalama     );
        }
       input.close();
    }
}