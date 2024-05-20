
public class ArrayDemo {
    public static void main(String args[]) {

        int A[] = new int[10];
        int B[] = { 1, 2, 3, 4, 5 };
        int C[];
        C = new int[10];
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();

        int D[][] = new int[3][4];
    }
}
