package model.heroes;


public class Main {

    public static void main(String[] args) {
        Hero mage = new Mage();
        Hero archer = new Archer();
        Hero knight = new Knight();
        archer.setName("Legolas");
        knight.setName("Aragorn");
        mage.setName("Gandalf");

        for(int i = 0; i<100; i++){
            mage.levelUp();
            mage.raiseInt();;
            mage.raiseAgi();
            mage.raiseDef();
            mage.raiseDex();
            mage.raiseSpd();
            mage.raiseStr();

            knight.levelUp();
            knight.raiseInt();;
            knight.raiseAgi();
            knight.raiseDef();
            knight.raiseDex();
            knight.raiseSpd();
            knight.raiseStr();

            archer.levelUp();
            archer.raiseInt();;
            archer.raiseAgi();
            archer.raiseDef();
            archer.raiseDex();
            archer.raiseSpd();
            archer.raiseStr();
        }

        printoutHero(mage);
        printoutHero(knight);
        printoutHero(archer);
    }

    static void printoutHero(Hero hero){
        System.out.println(hero.getName() + "\t|"
                + "str: " + hero.getStrength() + "\t|"
                + "def: " + hero.getDefence() + "\t|"
                + "int: " + hero.getIntelligence() + "\t|"
                + "agi: " + hero.getAgility() + "\t|"
                + "dex: " + hero.getSpeed() + "\t|");
    }
}
