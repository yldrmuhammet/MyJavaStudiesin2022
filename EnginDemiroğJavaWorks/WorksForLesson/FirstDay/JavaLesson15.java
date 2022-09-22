package FirstDay;

public class JavaLesson15 {
    public static void main(String[] args) {
        double[] myList = { 1.2, 1.3, 4.3, 5.6 }; // Liste Tanımladık

        double total = 0; // Toplam Değişkenini 0 olarak atadık
        double max = myList[0]; // Max değişkeni myList dizisinin 0. elemanı oldu

        for (double number : myList) { // My list içerisindeki number değişkeni
            if (max < number) {     // Eğer liste içerisindeki max = mylist 0 elamanı number
                                    // içerisinde ki değerden küçükse
                max = number;       // max değeri liste içerisinde ki numbera eşit
            }
            total = total + number; // 0 üzerine sırası ile sayıları topla
            System.out.println(number); // liste içerisinde ki elemanları sırala
        }
        System.out.println("Toplam = " + total); // Liste içerisinde bulunan sayıların toplamını ver
        System.out.println("En büyük = S" + max); // Liste içerisinde ki en büyük sayıyı ver
    }
}
