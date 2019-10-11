public class MyAlien {

    private String name;
    private int life;
    private int strenght;
    private int charm;
    private int vitality;

    public MyAlien (String name) {
        this.name = name;
        this.life = 100;
        this.strenght = 5;
        this.charm = 0;
        this.vitality = 10;
    }

    //getters

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

    //setters

    public void setLife (int life) {
        this.life = life;
    }

    public void setStrenght (int strenght) {
        this.strenght = strenght;
    }

    public void setCharm (int charm) {
        this.charm = charm;
    }

    public void setVitality (int vitality) {
        this.vitality = vitality;
    }
}