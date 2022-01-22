public class Paladin extends Player {

    private static final int DEFAULT_HEALTH = 100;
    private static final int DEFAULT_SCORE = 50;
    private static final int ATTACK_SCORE = 15;
    private static final int DAMAGE_VALUE = 7;
    private static final int HEALTH_AFTER_DAMAGE = 12;

    public Paladin(){
        super(DEFAULT_SCORE, DEFAULT_HEALTH);

    }


    @Override
    public void attack(Player enemy) {
        if(this.skill != null){
            this.health += skill.getBonus();
        }
        this.score += ATTACK_SCORE;
        int damageValue = DAMAGE_VALUE;
        if(artefact != null){
            damageValue += artefact.useInAttack();
        }
        enemy.damage(damageValue);
    }

    @Override
    public void damage(int value) {
        this.health -= HEALTH_AFTER_DAMAGE * value;

        if(health < 0){
            System.err.println("Паладин умер");
        }
    }
}
