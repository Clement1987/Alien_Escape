public class MyAlien {

    private String name;
    private int life;
    private int strength;
    private int charm;
    private int vitality;
    private int intelligence;

    public MyAlien (String name) {
        this.name = name;
        this.life = 100;
        this.strength = 5;
        this.charm = 0;
        this.vitality = 10;
        this.intelligence = 30;
    }

    //getters

    public String getName () {
        return this.name;
    }

    public int getLife () {
        return this.life;
    }

    public int getStrenght () {
        return this.strength;
    }

    public int getCharm () {
        return this.charm;
    }

    public int getVitality () {
        return this.vitality;
    }

    public int getIntelligence () {
        return this.intelligence;
    }

    //setters

    public void setName (String name) {
        this.name = name;
    }

    public void setLife (int life) {
        this.life = life;
    }

    public void setStrenght (int strength) {
        this.strength = strength;
    }

    public void setCharm (int charm) {
        this.charm = charm;
    }

    public void setVitality (int vitality) {
        this.vitality = vitality;
    }

    public void setIntelligence (int intelligence) {
        this.intelligence = intelligence;
    }
}