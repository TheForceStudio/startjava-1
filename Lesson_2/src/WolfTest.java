public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = PersonSex.FEMALE;
        wolf.age = 4;
        wolf.color = "white";
        wolf.name = "Pancake";

        System.out.println("Wolf's sex: " + wolf.sex);
        System.out.println("Wolf's age: " + wolf.age);
        System.out.println("Wolf's color: " + wolf.color);
        System.out.println("Wolf's name: " + wolf.name);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
