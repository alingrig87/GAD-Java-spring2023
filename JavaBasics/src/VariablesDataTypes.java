public class VariablesDataTypes {
    public static void main(String[] args) {
        byte b = 25; // -128 ... 127 (128 = 1000 0000, +127 = 0111 1111)
        short s = 2550; // -2^15 ... 2^15-1
        int n = 255; // -2^31 ...
        long l = 1000L; // -2^64 ....

        float f = 1.23F;
        double d = 1.2355;

        boolean bool = true;

        n = 1_000_000;

        long mac = 0x28_CD_C4_5C_AD_E3L;

        System.out.println("b = " + b + "\n" +  "s = " + s);
    }
}
