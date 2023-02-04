package sortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int A[] = { 23, 45, 11, 4, 1, 5 };
        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            int index = findMin(A, i, A.length);
            A[i] = A[index];
            A[index] = temp;

        }
        for (int value : A)
            System.out.print(value + "  ");

    }

    public static int findMin(int[] A, int s, int e) {
        int min = A[s], ans = 0;
        for (int i = s; i < e; i++) {
            if (min >= A[i]) {
                min = A[i];
                ans = i;
            }
        }

        return ans;
    }

}
