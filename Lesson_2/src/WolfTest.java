public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex(PersonSex.FEMALE);
        wolf.setAge(4);
        wolf.setColor("white");
        wolf.setName("Pancake");

        System.out.println("Wolf's sex: " + wolf.getSex());
        System.out.println("Wolf's age: " + wolf.getAge());
        System.out.println("Wolf's color: " + wolf.getColor());
        System.out.println("Wolf's name: " + wolf.getName());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
