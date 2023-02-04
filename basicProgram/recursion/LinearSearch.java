package recursion;

class LinearSearch {
    public static void main(String[] args) {

        int A[] = { 2, -11, 23, 4 };
        System.out.println(search(A, A.length - 1, 233));

    }

    public static boolean search(int[] A, int size, int num) {

        if (size == 0) {
            if (A[size] == num)
                return true;
            else
                return false;
        }

        if (A[size] == num)
            return true;

        return search(A, size - 1, num);

    }

}
