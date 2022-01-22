public class Main {

    public static void main(String[] args) {
	// write your code here
        Wizard wizard = new Wizard();
        Paladin paladin = new Paladin();
        Radiance radiance = new Radiance();
        Vanguard vanguard = new Vanguard();

        wizard.attack(paladin);
        wizard.setArtefact(radiance);
        paladin.attack(wizard);
        paladin.setArtefact(vanguard);
        paladin.setSkill(vanguard);

        System.out.println(wizard.getMana() + " " + wizard.getHealth() + " " + wizard.getScore());
        System.out.println(paladin.getHealth() + " " + paladin.getScore());
    }
}
