import java.util.Scanner;

//Kullanıcı Login Olsun veya Başa Dönsün
//Kimlik bilgilerini girsin yanlışsa güncellesin
//Güncellemek istemiyorsa sistemden çıksın

public class UserLoginAndIdenıty {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        System.out.println("Bilet Alım-Satım İşlemine Hoşgeldiniz");

// Kullanıcı Girişi
        boolean sonuc = true;
        while (sonuc) {

            System.out.println("Lütfen Kullanıcı Adınızı Giriniz");
            username = input.nextLine();
            
            System.out.println("Lütfen Parolanızı Giriniz");
            password = input.nextLine();
            

            if (username.equals("javadeneme") && password.equals("123")) {
                System.out.println("Tebrikler Başarı ile Giriş Yaptınız!");
                break;
            } else {
                System.out.println(
                        "Hatalı Giriş Tekrar Denemek İstermiziniz ?\nEvet  için    1\nHayır için    2\n Yazınız");
                int secim = input.nextInt();
                switch (secim) {
                    case 1:
                        System.out.println("Login Ekranına Yönlendiriliyorsunuz");
                        continue;
                        //bak
                    case 2:
                        System.out.println("Sistem Kapanıyor!!");
                        break;
                }
            }
        }

// Kişisel bilgi girişi

        boolean kisibilgi = true;
        while (kisibilgi) {

            int yas, kimlik;
            String cinsiyet, isimsoyisim;

            System.out.println("Lütfen kişisel bilgilerinizi Giriniz");
            System.out.println("12 ve 24 yaş aralığında %10\n65 üzeri için ise %40\nİndirim uygulanacaktır.");

            System.out.println("Ad ve Soyadınız :");
            isimsoyisim = input.nextLine();
            

            System.out.println("Yaşınız :");
            yas = input.nextInt();
            

            System.out.println("Kimlik Numaranız :");
            kimlik = input.nextInt();

            System.out.println("Cinsiyetiniz");
            cinsiyet = input.nextLine();

            System.out.println("Kişisel bilgileriniz");

            System.out.println("Adınız ve Soyadınız :" + isimsoyisim);
            System.out.println("Yaşınız             :" + yas);
            System.out.println("Kimlik Numaranız    :" + kimlik);
            System.out.println("Cinsiyetiniz        :" + cinsiyet);

            System.out.println("Bilgilerinize Doğrulayın");
            System.out.println("Evet için 1\nHayır için 2\nRakamlarını Giriniz :");
            int dogrulama = input.nextInt();

            switch (dogrulama) {
                case 1:
                    System.out.println("Doğrulama için Teşekkürler ");
                    break;
                case 2:
                    System.out.println("Tekrar Denemek İstermisiniz ?");
                    System.out.println("Evet için 3\n Hayır İçin 4");
                    int deneme = input.nextInt();
                    if (deneme == 1) {

                        System.out.println("Bilgi Ekranına Yönlendiriliyorsunuz.");
                        continue;
                    }

                    else if (deneme == 2) {
                        System.out.println("Sistemden Çıkış Yapılıyor.");
                        break;
                    }

            }

        }





        input.close();
    }

}
