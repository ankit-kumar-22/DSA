package binarySearchApplication;

class PivotInRotatedSortedArray {
    public static void main(String[] args) {

        int A[] = { 10, 1, 2, 5, 6 };
        System.out.println(returnPivot(A, A.length));

    }

    public static int returnPivot(int[] A, int n) {
        int low = 0;
        int high = (n - 1);
        int mid = (low + high) / 2;
        while (low < high) {

            if (A[mid] >= A[0])
                low = mid + 1;
            else
                high = mid;
            mid = (low + high) / 2;

        }

        return low;
    }

}
