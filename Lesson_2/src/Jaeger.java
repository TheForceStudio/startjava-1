public class Jaeger {
    private String modelName = "Bracer Phoenix";
    private String mark = "Mark-5";
    private String origin = "USA";
    private float height = 70.7F;
    private float weight = 2.1F;
    private int speed = 3;
    private int strength = 8;
    private int armor = 9;

    public Jaeger() {}

    public Jaeger(String modelName, String mark) {
        this.modelName = modelName;
        this.mark = mark;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");

    }

    String scanKaiju() {
        return "nothing";
    }

    void useVortexCannon() {

    }

    /* Setters */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Hello, my name is "
                + this.modelName
                + ", "
                + this.mark
                + ". I was made in "
                + this.origin + "!";
    }
}
