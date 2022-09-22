package FirstDay;

public class JavaLesson7_18 {
    public static void main(String[] args) {

        // DERS 17

        String mesaj = "Bugün Hava Çok Güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : " + mesaj.length()); // Karakter sayısı hesaplar
        System.out.println("5.Eleman : " + mesaj.charAt(4)); // indexdeki elemanı söyler

        System.out.println(mesaj.concat("Yaşasın!")); // Birleştirme yapar

        System.out.println(mesaj.startsWith("A")); // İlk harfi kontrol eder true false döndürür
        System.out.println(mesaj.endsWith(".")); // Son harfi kontrol eder true false döndürür

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf("a"));

        // DERS 18

        // System.out.println(mesaj.replace(' ', '_')); // Seçtiğimiz Karakter
        // Düzetlmeye yarar

        String yeniMesaj = mesaj.replace(" ", "_");
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2, 5)); // 2'den başla 5'e kadar getir

        for (String kelime : mesaj.split(" ")) { // Boşluğa göre değer kelimleri tek tek yazdırdık
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}
