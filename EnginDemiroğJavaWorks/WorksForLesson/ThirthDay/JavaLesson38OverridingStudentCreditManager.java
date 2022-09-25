package ThirthDay;

public class JavaLesson38OverridingStudentCreditManager extends JavaLesson38OverridingBaseCreditManager{

    public void add(String message){
        System.out.println("Student Calculated Credit : " +message);
    }
    public double transaction(double amount){
        return amount * 1.10;                   // 1.18 Interest Amount Example
    }


}
