package model.heroes;

public class Knight extends Hero{

    @Override
    protected void modifyStrength() {
        strength=(int)((strength+1)/1.2);
        strength++;
        strength*=1.2;
    }

    @Override
    protected void modifyDefence() {
        defence=(int)((defence+1)/1.1);
        defence++;
        defence*=1.1;
    }

    @Override
    protected void modifyIntelligence() {
        intelligence++;
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
        speed=(int)((speed+1)/1.05);
        speed++;
        speed*=1.05;
    }
}
