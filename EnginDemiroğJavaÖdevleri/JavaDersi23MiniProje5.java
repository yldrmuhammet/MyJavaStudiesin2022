public class JavaDersi23MiniProje5 {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,9,0};

        int aranacak = 6;
        boolean varmi = false;

        for( int sayi: sayilar){
            if(sayi==aranacak){
                //System.out.println("Sayı Mevcuttur");
                varmi = true;
                break;
            }
        }
        if(varmi){
            System.out.println("Sayi Mevcuttur");
        }
        else{
            System.out.println("Sayi Mevcut Değildir");
        }

    }
}
