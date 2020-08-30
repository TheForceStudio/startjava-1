public class ConditionalStatement {
    static int age = 16;
    static boolean isMale = true;
    static float height = 1.81F;
    static String name = "Michael";

    public static void main(String[] args) {
        if (age > 20) {
            System.out.println("age > 20");
        }

        if (isMale) {
            System.out.println("isMale");
        }

        if (!isMale) {
            System.out.println("!isMale");
        }

        if (height < 1.80F) {
            System.out.println("height < 1.80F");
        } else {
            System.out.println("height >= 1.80F");
        }

        if (name.startsWith("M")) {
            System.out.println("name.startsWith(\"M\")");
        } else if (name.startsWith("И")) {
            System.out.println("name.startsWith(\"И\")");
        } else {
            System.out.println("name.startsWith(\"smth else\")");
        }

    }
}
