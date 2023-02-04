package sortingAlgos;

class BubbleSort {
    public static void main(String[] args) {
        int A[] = { 8, 22, 7, 9, 31, 5, 13 };
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    count++;
                }
            }
            for (int value : A)
                System.out.print(value + " ");
            System.out.println();

        }

        System.out.println(count);

    }
}
