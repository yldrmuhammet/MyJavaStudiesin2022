package CharacterTraits;

public class Main {
    public static void main(String[] args) {

        // Basit bir karakter ve özellik projesi

        // Archer set value
        
        Archer archer = new Archer();
        archer.setId(1);
        archer.setName("Legolas");
        archer.setHealth(100);
        ;
        archer.setDamage(30);
        archer.setGold(300);
        archer.setSpecialAttack("Ateşli OK");
        archer.setComboDamage(20);
        archer.setReloadTime(3);
        archer.setSpecialAttackTime(10);

        // Warior set value
        Warior warior = new Warior();
        warior.setId(2);
        warior.setName("Berserker");
        warior.setHealth(500);
        warior.setDamage(50);
        warior.setGold(500);
        warior.setSpecialAttack("Kılıç Saldırısı");
        warior.setComboDamage(50);
        warior.setReloadTime(5);
        warior.setSpecialAttackTime(5);

        Npc npc = new Npc();
        npc.setId(3);

        Monster[] monsters = { archer, warior, npc};

        for (Monster monster : monsters) {
            System.out.println(monster.getName() + "\n" + monster.getDamage());      
        }

        System.out.println("---------------------------------------------");



        Warior[] wariors = {warior};

            for (Warior w : wariors) {
                System.out.println(w.getId());
                System.out.println(w.getComboDamage());
                
            }

        

    }
}