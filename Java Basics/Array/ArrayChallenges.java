
import java.util.*;

public class ArrayChallenges {
    static Scanner sc = new Scanner(System.in);
    private static int[] a;

    static void findingSum(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        System.out.printf("Total Sum of A is: %d\n", sum);
    }

    static void searchElement(int[] A) {
        int search;
        System.out.print("Enter number you want to search: ");
        search = sc.nextInt();
        for (int x : A) {
            if (x == search) {
                System.out.printf("%d is in the array\n", search);
                return;
            }
        }
        System.out.printf("%d i not in the array\n", search);
    }

    static void findMax(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }
        System.out.printf("The maximum number in the array: %d\n", max);
    }

    static void findSecondMax(int[] A) {
        int max1 = A[0];
        int max2 = A[0];
        boolean max2Changed = false;
        for (int i = 1; i < A.length; i++) {
            if (max1 < A[i]) {
                max2 = max1;
                max1 = A[i];
            } else {
                if (max2Changed == false) {
                    max2 = A[i];
                    max2Changed = true;
                } else {
                    if (A[i] >= max2)
                        max2 = A[i];
                }
            }
        }
        System.out.printf("The second maximum number in the array: %d\n", max2);
    }

    static void rotateArray(int A[]) {

        System.out.println("Original Array");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Right rotation");
        int res[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[(i - 1 + A.length) % A.length];
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        System.out.println("Left rotation");
        int res1[] = new int[A.length];
        for (int i = 0; i < A.length; i++)
            res1[i] = A[(i + 1) % A.length];

        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println();
    }

    static void insertElement(int A[]) {
        int n;
        int pos;
        System.out.print("Enter number and position to insert: ");
        n = sc.nextInt();
        pos = sc.nextInt();
        if (pos < 0 || pos >= A.length) {
            System.out.printf("Cannot insert %d at position %d\n", n, pos);
            return;
        }
        System.out.println("Original Array");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[i];
        }

        if (pos == A.length - 1) {
            res[pos] = n;
        } else {
            int j = A.length - 2;
            while (j >= pos) {
                res[j + 1] = res[j];
                j--;
            }
            res[j + 1] = n;
        }
        System.out.println("After Inserting Array");
        for (int i = 0; i < A.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    static void deleteElement(int[] A) {
        int pos;
        System.out.print("Enter the position you want to delete: ");
        pos = sc.nextInt();
        if (pos < 0 || pos > 10) {
            System.out.printf("Cannot delete the number at index %d\n", pos);
            return;
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[i];
        }

        System.out.println("Original Array");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        while (pos < A.length && (pos + 1) < A.length) {
            res[pos] = res[pos + 1];
            pos++;
        }
        System.out.println("After Deleting Array");
        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

    }

    static void copyArray(int[] A) {
        int B[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        System.out.println("Copy Array");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] A) {
        int B[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        int i = 0;
        int j = B.length - 1;
        while (i < j) {
            int temp = B[i];
            B[i] = B[j];
            B[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reverse Copy Array");
        for (int k = 0; k < B.length; k++) {
            System.out.print(B[k] + " ");
        }
        System.out.println();
    }

    static void increasingSizeofArray(int[] A) {
        int B[] = new int[A.length * 2];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        A = B;
        System.out.println("A length is " + A.length);
        return;
    }

    static void addingMatrices(int[][] A, int[][] B) {
        int C[][] = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int x[] : C) {
            for (int y : x) {
                System.out.printf("%02d ", y);
            }
            System.out.println();
        }

    }

    static void sortArrayString(String arr[]) {
        System.out.println("Before");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("After");
        java.util.Arrays.sort(arr);
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();

    }

    static void multiplyingMatrices(int[][] A, int[][] B) {
        int C[][] = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = 0;
                int[] row = A[i];
                for (int k = 0; k < row.length; k++) {
                    sum += row[k] * B[k][j];
                }

                C[i][j] = sum;
            }
        }
        for (int x[] : C) {
            for (int y : x) {
                System.out.printf("%02d ", y);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int option;
        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

        int B[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int C[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };
        String arr[] = {"java","python","pascal","smalltalk","ada","basic"};
        while (true) {
            System.out.println(
                    "Enter your choices:\n1. Finding Sum of all elements\n2. Searching an Element\n3. Finding Maximum Element\n4. Finding Second Largest Element");

            System.out.println("5. Rotating an Array\n6. Inserting an Element\n7. Deleting an Element");
            System.out.println("8. Copy an Array\n9. Reverse Copying an Array\n10. Increasing size of Array");
            System.out.println(("11. Adding 2 Matrices\n12. Multiplying 2 Matrices\n13. Sorting Array of Strings"));
            option = sc.nextInt();
            if (option == 1) {
                findingSum(A);
            } else if (option == 2) {
                searchElement(A);
            } else if (option == 3) {
                findMax(A);
            } else if (option == 4) {
                findSecondMax(A);
            } else if (option == 5) {
                rotateArray(A);
            } else if (option == 6) {
                insertElement(A);
            } else if (option == 7) {
                deleteElement(A);
            } else if (option == 8) {
                copyArray(A);
            } else if (option == 9) {
                reverseArray(A);
            } else if (option == 10) {
                increasingSizeofArray(A);
            } else if (option == 11) {
                addingMatrices(B, C);
            } else if (option == 12) {
                multiplyingMatrices(B, C);
            }else if(option == 13){
                sortArrayString(arr);
            }

            System.out.println("----------------");
        }

    }
}