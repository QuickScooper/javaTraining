public class Wizard extends Player{

    private static final int DEFAULT_HEALTH = 80;
    private static final int DEFAULT_SCORE = 100;
    private static final int DEFAULT_MANA = 100;
    private static final int ATTACK_MANA = 2;
    private static final int ATTACK_SCORE = 8;
    private static final int DAMAGE_VALUE = 5;
    private static final int HEALTH_AFTER_DAMAGE = 6;

    private int mana;

    public Wizard(){
        super(DEFAULT_SCORE,DEFAULT_HEALTH);
        this.mana = DEFAULT_MANA;
    }

    @Override
    public void attack(Player enemy){
        if(this.mana <= 0){
            System.err.println("Волшебник без маны, атака невозможна!");
            return;
        }
        this.mana -= ATTACK_MANA ;
        this.score += ATTACK_SCORE;
        int damageValue = DAMAGE_VALUE;
        if(artefact != null){
            damageValue += artefact.useInAttack();
        }
        enemy.damage(damageValue);
    }

    @Override
    public void damage(int value){
        this.health -= HEALTH_AFTER_DAMAGE * value + artefact.useInDamage();

        if(health < 0){
            this.mana = 0;
            System.err.println("Волшебник умер");
        }
    }

    public int getMana() {
        return mana;
    }
}
