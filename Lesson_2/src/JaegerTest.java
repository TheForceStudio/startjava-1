public class JaegerTest {
    public static void main(String[] args) {
        Jaeger first = new Jaeger();
        Jaeger second = new Jaeger();

        /**
         * private String modelName = "Bracer Phoenix";
         *     private String mark = "Mark-5";
         *     private String origin = "USA";
         *     private float height = 70.7F;
         *     private float weight = 2.1F;
         *     private int speed = 3;
         *     private int strength = 8;
         *     private int armor = 9;
         */

        first.setMark("Mark-6");
        first.setOrigin("UK");
        first.scanKaiju();
        System.out.println(first);

        second.setMark("Mark-7");
        second.setArmor(40);
        second.setSpeed(1);
        System.out.println(second);
    }
}
