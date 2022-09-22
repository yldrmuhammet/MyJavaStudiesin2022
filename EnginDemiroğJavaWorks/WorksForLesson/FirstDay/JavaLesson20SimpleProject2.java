package FirstDay;

import java.util.Scanner;

public class JavaLesson20SimpleProject2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf Girdiniz");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce Sesli Harf Girdiniz");
            default:
                System.out.println("Geçersiz bir değer girdiniz");
        }

        input.close();
    }
}
