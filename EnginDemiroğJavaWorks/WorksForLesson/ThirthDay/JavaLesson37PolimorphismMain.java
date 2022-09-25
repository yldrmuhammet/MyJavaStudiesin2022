package ThirthDay;

public class JavaLesson37PolimorphismMain {
    public static void main(String[] args) {

       /* PolimorphismBaseLogger[] loggers = new PolimorphismBaseLogger[]{new PolimorphismFileLogger(), new PolimorphismEMailLogger(),
                new PolimorphismDataBaseLogger(), new PolimorphismConsoleLogger()};
        for (PolimorphismBaseLogger logger : loggers) {
            logger.Log("Log Message"); }*/

        JavaLesson37CustomerManager customerManager = new JavaLesson37CustomerManager(new JavaLesson37PolimorphismFileLogger());
        customerManager.add();

    }
}
