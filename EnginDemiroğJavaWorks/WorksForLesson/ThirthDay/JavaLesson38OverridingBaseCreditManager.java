package ThirthDay;

public class JavaLesson38OverridingBaseCreditManager {
    protected JavaLesson38OverridingStudentCreditManager credit;


    public double transaction(double amount){
        return amount * 1.18;                   // 1.18 Interest Amount Example
    }
    public void add(String message){
        System.out.println("Calculated Credit  :" +message);
    }


}
