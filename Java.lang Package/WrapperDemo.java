public class WrapperDemo {
    public static void main(String[] args) {
        // Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Short f = Short.valueOf("123");

        Float g = 12.34f;
        Float h = Float.valueOf("123.5");

        Double j = Double.valueOf(123.456);

        Character k = Character.valueOf('A');

        Boolean l = Boolean.valueOf(true);

        float x = h.floatValue();
        float y = h;
    }
}
