package recursion;

class QuickSort {
    public static void main(String[] args) {
        int A[] = { 8, 22, 7, 9, 31, 5, 13, -11 };
        A = quickSort(A, 0, A.length - 1);
        for (int value : A)
            System.out.print(value + "  ");

    }

    public static int[] quickSort(int[] A, int s, int e) {
        if (s >= e)
            return A;

        int index = parition(A, s, e);

        quickSort(A, s, index - 1);
        quickSort(A, index + 1, e);
        return A;

    }

    public static int parition(int[] A, int s, int e) {

        int pivot = A[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (A[i] < pivot)
                count++;
        }

        int pivotIndex = s + count;

        int temp = A[pivotIndex];
        A[pivotIndex] = A[s];
        A[s] = temp;

        int i = s;
        int j = e;

        while (i < pivotIndex && j > pivotIndex) {
            while (A[i] < pivot) {
                i++;
            }

            while (A[j] > pivot) {
                j--;
            }

            if (A[i] >= pivot && A[j] <= pivot) {
                int temp1 = A[i];
                A[i] = A[j];
                A[j] = temp1;
                i++;
                j--;
            }
        }

        return pivotIndex;

    }

}
