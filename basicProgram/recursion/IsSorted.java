package recursion;

public class IsSorted {
    public static void main(String[] args) {
        int A[] = { 2, 34 };
        System.out.println(isArraySorted(A, A.length - 1, 0, 1));

    }

    public static boolean isArraySorted(int[] A, int length, int l, int r) {

        if (length < 1)
            return true;

        if (r == length) {
            return A[l] < A[r];
        }

        if (A[l] < A[r])
            return isArraySorted(A, length, l + 1, r + 1);
        else
            return false;

    }

}
