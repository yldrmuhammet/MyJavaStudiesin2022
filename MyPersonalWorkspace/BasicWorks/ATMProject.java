import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bakiye = 1000, secim, miktar;

        System.out.println("X bankasına Hoşgeldiniz");
        System.out.println("Güncel Bakiniz : " + bakiye);

        System.out.println("Lütfen Yapmak İstediğiniz işlemi seçin");

        while (bakiye > 0) {
            System.out.println("1-) PARA Yatır");
            System.out.println("2-) PARA ÇEK");
            System.out.println("3-) BAKİYE SORGULA");
            System.out.println("4-) ÇIKIŞ YAP");
            secim = input.nextInt();

            if (secim == 1) {
                System.out.println("Ne kadar Para Yatırmak İstiyorsunuz ?");
                miktar = input.nextInt();
                bakiye += miktar;
                System.out.println("Başarı İle Para Yatırdınız");
            } else if (secim == 2) {
                System.out.println("Ne kadar Çekim Yapmak İstiyorsunuz ?");
                miktar = input.nextInt();
                bakiye -= miktar;
                System.out.println("Başarı İle Para Çektiniz");
            } else if (secim == 3) {
                System.out.println("GÜNCEL BAKİYENİZ  : " +bakiye +" TL");
            } else if (secim == 4){
                System.out.println("Bankamızı Tercih Ettiğiniz için Teşekkürer");
                break;
            }
            else{
                System.out.println("Geçersiz bir değer girdiniz lütfen tekrar Deneyiniz");
            }

        }
        input.close();
    }
}
