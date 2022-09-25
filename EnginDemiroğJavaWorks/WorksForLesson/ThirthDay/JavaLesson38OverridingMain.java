package ThirthDay;

public class JavaLesson38OverridingMain {
    public static void main(String[] args) {

        JavaLesson38OverridingBaseCreditManager[] CreditManagers = new JavaLesson38OverridingBaseCreditManager[]
                {new JavaLesson38OverridingAgricultureCreditManager(), new JavaLesson38OverridingTeacherCreditManager(), new JavaLesson38OverridingStudentCreditManager()};
        for (JavaLesson38OverridingBaseCreditManager CreditManager : CreditManagers) {

            CreditManager.add("" + CreditManager.transaction(1000));

        }

    }
}
