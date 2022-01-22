public class Vanguard implements Artefact, PassiveSkill{
    @Override
    public int useInAttack() {
        return 5;
    }

    @Override
    public int useInDamage() {
        return 5;
    }

    @Override
    public int getBonus() {
        return 0;
    }
}
