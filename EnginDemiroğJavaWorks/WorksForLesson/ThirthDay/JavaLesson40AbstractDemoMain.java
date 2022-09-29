package ThirthDay;

public class JavaLesson40AbstractDemoMain {
    public static void main(String[] args) {
        JavaLesson40AbstractDemoCustomerManager customerManager = new JavaLesson40AbstractDemoCustomerManager();
        customerManager.dataBaseManager = new JavaLesson40AbstractOracleDataBaseManager();
        customerManager.getCustomers();
    }




}
