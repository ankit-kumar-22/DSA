package recursion;

class BubbleSort {
    public static void main(String[] args) {
        int A[] = { 8, 22, 7, 9, 31, 5, 13, -11 };
        int ans[] = sort(A, A.length);
        for (int value : ans)
            System.out.print(value + "  ");

    }

    public static int[] sort(int[] A, int size) {

        if (size == 0)
            return A;

        for (int i = 0; i < size - 1; i++) {
            if (A[i] > A[i + 1]) {
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }
        }

        return sort(A, size - 1);
    }

}
