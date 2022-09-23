public class JavaLesson25_26ParamatersMethods {

    public static void main(String[] args) {
        
        String newMessage = giveCity();
        System.out.println(newMessage);
    

        int number = addition(5, 7);
        System.out.println(number);

        int addition = addition2(2,3,4,5,6,10);
        System.out.println(addition);

    }

    public static void add() {
        System.out.println("Eklendi");

    }

    public static void delete() {
        System.out.println("Silindi");

    }

    public static void update() {
        System.out.println("Güncellendi");

    }

    public static int addition(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int addition2(int... numbers){        // 3 point variable arguments
        int addition = 0;
        for(int number : numbers){
            addition += number;
            
        }
        return addition;
    }

    public static String giveCity() {
        return "Ankara";
    }

}