package ThirthDay;

public class JavaLesson38OverridingAgricultureCreditManager extends JavaLesson38OverridingBaseCreditManager {
    public void add(String message){
        System.out.println("For Agriculture Calculated Credit : " +message);
    }
    public double transaction(double amount){
        return amount * 1.15;                   // 1.18 Interest Amount Example
    }
}
