package ThirthDay;

public abstract class JavaLesson39AbstractGameCalculor {
    public abstract void transaction();             // Who is inheritance transaction, that operation you must be overriding transaction.

    public final void gameOver(){                   // final not to change
        System.out.println("Game Over");
    }
}
