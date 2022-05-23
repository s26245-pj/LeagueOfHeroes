package model.heroes;

public class Mage extends Hero {
    @Override
    protected void modifyStrength() {
        strength++;
    }

    @Override
    protected void modifyDefence() {
        defence++;
    }

    @Override
    protected void modifyIntelligence() {
        intelligence=(int)((intelligence+1)/1.2);
        intelligence++;
        intelligence*=1.2;
    }

    @Override
    protected void modifyDexterity() {
        dexterity=(int)((dexterity+1)/1.05);
        dexterity++;
        dexterity*=1.05;
    }

    @Override
    protected void modifyAgility() {
        agility=(int)((agility+1)/1.02);
        agility++;
        agility*=1.02;
    }

    @Override
    protected void modifySpeed() {
        speed++;
    }
}
