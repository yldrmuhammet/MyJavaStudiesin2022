package CharacterTraits;

public class Warior extends Monster {

    private String specialAttack;
    private int comboDamage;
    private int reloadTime;
    private double specialAttackTime;
    private int hitCount;

    public String getSpecialAttack() {
        return specialAttack;
    }
    public int getComboDamage() {
        return comboDamage;
    }
    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
    public void setComboDamage(int comboDamage) {
        this.comboDamage = comboDamage;
    }
    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }
    public void setSpecialAttackTime(double specialAttackTime) {
        this.specialAttackTime = specialAttackTime;
    }
    public int getHitCount() {
        return hitCount;
    }
    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
    public int getReloadTime() {
        return reloadTime;
    }
    public double getSpecialAttackTime() {
        return specialAttackTime;
    }
    

   

}