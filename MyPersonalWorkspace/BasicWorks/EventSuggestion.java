import java.util.Scanner;

public class EventSuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Etkinlik Öneren Program");

        System.out.print("\nLütfen hava sıcaklığını giriniz  :");

        int sicaklik = input.nextInt();

        if (sicaklik > 30) {
            System.out.println("Yüzmeye Gidebilirsiniz..");

        }
        else if(sicaklik <= 30 && sicaklik>4)
            System.out.println("Sinemaya Gidebilirsiniz");
        else{
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
        input.close();
    }

}
