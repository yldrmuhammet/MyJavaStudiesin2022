package ThirthDay;

public class JavaLesson37CustomerManager {
    private JavaLesson37PolimorphismBaseLogger logger;

    public JavaLesson37CustomerManager(JavaLesson37PolimorphismBaseLogger logger){
        this.logger = logger;

    }
    public void add(){
        System.out.println("Customer Added");
        this.logger.log("Log message");

    }
}
