public class JavaDersi19MiniProje1 {
    public static void main(String[] args) {
        int number = -2;
        int remainder = number % 2; // Mod oparetörü ( Bölümünden Kalan)
        //System.out.println(remainder);
        boolean isPrime = true; // Asal sayımı ?

        // Asal Sayı kuralı 1 ve kendinden başka tam sayı böleni olmaz

        if(number ==1){
            System.out.println("Sayı Asal Değildir.");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz Sayı");
        }

        for(int i = 2; i<number; i++){
            if(number % 2  == 0){
                isPrime = false;
            }      
        }

        if(isPrime){
            System.out.println("Sayı Asaldır.");
        }

        else{
            System.out.println("Sayı Asal Değildir.");
        }
    }
}
