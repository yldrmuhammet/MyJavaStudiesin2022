public class JavaLesson24Methods {
    public static void main(String[] args) {

        findNumber();

    }

    public static void findNumber() {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

        int sought = 6;

        boolean ısThere = false;

        for (int number : numbers) {
            if (number == sought) {
                ısThere = true;
                break;
            }
        }
        if (ısThere) {
            sendMessage("Number is available : " + sought);
        } else {
            sendMessage("Number is not available : " + sought);
        }

    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}
