public class UnaryOperation {
    public static void main(String[] args) {
        int a = 15;
        int b = 1;
        float f = 4294967296.0f;
        float f1 = 65536.0f;
        float f2 = 65536.04f;
        float f3 = 65536.06f;
//        System.out.println(binaryString(a));
        System.out.println(binaryString(f));
        System.out.println(binaryString(f1));
        System.out.println(binaryString(f2));
        System.out.println(binaryString(f3));
//        System.out.println(binaryString(rightShift(a, b)));
//        System.out.println(rightShift(a, b));
//        System.out.println(binaryString(rightShiftWithNulls(a, b)));
//        System.out.println(rightShiftWithNulls(a, b));
        int intBits = Integer.parseInt("00000001000000000000000000000000", 2);
        float myFloat = Float.intBitsToFloat(intBits);
        System.out.println(String.valueOf(myFloat));

        intBits = Integer.parseInt("00000010000000000000000000000000", 2);
        myFloat = Float.intBitsToFloat(intBits);
        System.out.println(String.valueOf(myFloat));
    }

    private static void not(byte example) {
        System.out.println(~example);
    }

    private static int not(int example) {
        return ~example;
    }

    private static void and(byte a, byte b) {
        System.out.println(a & b);
    }

    private static int and(int a, int b) {
        return a & b;
    }

    private static void or(byte a, int b) {
        System.out.println(a | b);
    }

    private static int or(int a, int b) {
        return a | b;
    }

    private static void excludingOr(byte a, byte b) {
        System.out.println(a ^ b);
    }

    private static int excludingOr(int a, int b) {
        return a ^ b;
    }

    private static void rightShift(byte a, byte shift) {
        System.out.println(a >> shift);
    }

    private static int rightShift(int a, int shift) {
        return a >> shift;
    }

    private static void rightShiftWithNulls(byte a, byte shift) {
        System.out.println(a >>> shift);
    }

    private static int rightShiftWithNulls(int a, int shift) {
        return a >>> shift;
    }

    private static void leftShift(byte a, byte shift) {
        System.out.println(a << shift);
    }

    private static int leftShift(int a, int shift) {
        return a << shift;
    }

    private static String binaryString(int a) {
        return String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');
    }

    private static String binaryString(float a) {
        return String.format("%32s", Integer.toBinaryString(Float.floatToIntBits(a))).replace(' ', '0');
    }
}
