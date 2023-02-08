package recursion;

class MergeSort {
    public static void main(String[] args) {
        int A[] = { 8, 22, 7, 9, 31, 5, 13, -11 };
        mergeSort(A, 0, A.length - 1);
        for (int value : A)
            System.out.print(value + " ");

    }

    public static int[] mergeSort(int[] A, int s, int e) {

        if (s >= e)
            return A;

        int mid = (s + e) / 2;

        mergeSort(A, s, mid);

        mergeSort(A, mid + 1, e);

        return mergeSortedArray(A, s, e);

    }

    public static int[] mergeSortedArray(int A[], int s, int e) {
        int mid = (s + e) / 2;

        int l1 = (mid - s) + 1;
        int l2 = (e - mid);
        int B[] = new int[l1];
        int C[] = new int[l2];

        int k = s;
        for (int i = 0; i < l1; i++)
            B[i] = A[k++];

        for (int i = 0; i < l2; i++)
            C[i] = A[k++];

        // combine two arrays

        int index1 = 0;
        int index2 = 0;
        k = s;
        while (index1 < l1 && index2 < l2) {

            if (B[index1] < C[index2])
                A[k++] = B[index1++];
            else
                A[k++] = C[index2++];

        }

        while (index1 < l1)
            A[k++] = B[index1++];

        while (index2 < l2)
            A[k++] = C[index2++];

        return A;

    }
}
