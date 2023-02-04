package sortingAlgos;

class InsertionSort {
    public static void main(String[] args) {
        int A[] = { 10, 1, 7, 4, 8, 11 };
        for (int i = 1; i < A.length; i++) {
            int temp = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > temp) {
                    A[j + 1] = A[j];
                    A[j] = temp;
                } else
                    break;
            }

        }

        for (int value : A)
            System.out.print(value + "  ");

    }

}
