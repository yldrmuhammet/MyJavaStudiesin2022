import java.util.Scanner;

// Calculating the area and volume of a circle
// Bir dairenin alan ve hacmini hesaplama

public class CircleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yarı çap ölçüsünü almalıyız

        int r;
        double alan, hacim;
        float pi = (float) 3.14;

        System.out.println(" Daire Alan ve Hacim Hesaplama"     );

        System.out.println(" Dairenin yarıçap değerini giriniz" );
        
        r = input.nextInt();

        alan = (float) ( 2 *  r * pi );
        System.out.println("Dairenizin Alanı :" +alan );

        hacim = (float) (pi * r * r );
        System.out.println("Dairenizin Hacmi :" +hacim);

        input.close();
    
        


    }
    
}
