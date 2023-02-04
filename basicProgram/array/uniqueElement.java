package array;

class uniqueElement {
    public static void main(String[] args) {
        int A[] = { 5, 4, 5 };
        System.err.println(findUnique(A));

    }

    public static int findUnique(int[] arr) {
        int A[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            A[arr[i]] += 1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1)
                return i;

        }

        return 0;
    }
}
