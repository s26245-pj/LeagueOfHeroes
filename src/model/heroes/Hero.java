package model.heroes;

public abstract class Hero {
    protected String name;
    protected int strength;
    protected int defence;
    protected int intelligence;
    protected int dexterity;
    protected int agility;
    protected int speed;
    protected int availableStatsPoints;

    protected abstract void modifyStrength();
    protected abstract void modifyDefence();
    protected abstract void modifyIntelligence();
    protected abstract void modifyDexterity();
    protected abstract void modifyAgility();
    protected abstract void modifySpeed();

    public int getAvailableStatsPoints() {
        return availableStatsPoints;
    }

    public void levelUp(){
        availableStatsPoints+=10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void raiseStr(){
        if(availableStatsPoints<=0)return;
        modifyStrength();
        availableStatsPoints--;
    }

    public void raiseDef(){
        if(availableStatsPoints<=0)return;
        modifyDefence();
        availableStatsPoints--;
    }

    public void raiseInt(){
        if(availableStatsPoints<=0)return;
        modifyIntelligence();
        availableStatsPoints--;
    }

    public void raiseDex(){
        if(availableStatsPoints<=0)return;
        modifyDexterity();
        availableStatsPoints--;
    }

    public void raiseAgi(){
        if(availableStatsPoints<=0)return;
        modifyAgility();
        availableStatsPoints--;
    }

    public void raiseSpd(){
        if(availableStatsPoints<=0)return;
        modifySpeed();
        availableStatsPoints--;
    }

}
