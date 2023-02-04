package recursion;

class SunOfArray {
    public static void main(String[] args) {
        int A[] = { 2, -4, 4, 5, 10 };
        System.out.println(sum(A, A.length - 1));

    }

    public static int sum(int[] A, int size) {
        if (size == 0)
            return A[0];

        return A[size] + sum(A, size - 1);
    }

}
