package CharacterTraits;

public class Archer extends Monster {

    private String specialAttack;
    private int comboDamage;
    private int reloadTime;
    private double specialAttackTime;

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getComboDamage() {
        return comboDamage;
    }

    public void setComboDamage(int comboDamage) {
        this.comboDamage = comboDamage;
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public double getSpecialAttackTime() {
        return specialAttackTime;
    }

    public void setSpecialAttackTime(double specialAttackTime) {
        this.specialAttackTime = specialAttackTime;
    }

}