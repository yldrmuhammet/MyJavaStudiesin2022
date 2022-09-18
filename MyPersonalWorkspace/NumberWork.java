import java.util.Scanner;

public class NumberWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // For ile 1'den 5'e kadar yazdırma

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        

        System.out.println("--------------------------------");

        // While ile 1'den 5'e kadar yazdırma

        int k = 0;
        while (k <= 5) {
            System.out.println(k);
            k++;
        }
        System.out.println("--------------------------------");
        
        // İç içe For Kullanımı
        for (int i = 0; i <= 5; i++) {
            for(int j=1; j<=5; j++){
                System.out.println("i =" +i + "  j =" +j);

            }
        }

        System.out.println("--------------------------------");


        input.close();
    }
}
