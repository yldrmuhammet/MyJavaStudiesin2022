import java.util.Scanner;

//Hedef
//Kullanıcı adı ve şifre girerek giriş yapmasını sağlamak.

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String k_adi, parola;

        System.out.println("Giriş Ekranı"               );

        System.out.println("Kullanıcı Adınızı Giriniz :");
        k_adi = input.nextLine();

        System.out.println("Parolanızı Giriniz :"       );
        parola = input.nextLine();

        if (k_adi.equals("java") && parola.equals("123")) {
            System.out.println("Başarı ile giriş yaptınız..");
        }

        else {
            System.out.println("Kullanıcı adı veya parolanız yanlış!");
        }

        input.close();
    }
    
}
