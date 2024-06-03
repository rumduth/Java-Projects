
public class FinalDemo {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Kaka");
        }
    }
}
