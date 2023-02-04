package binarySearchApplication;

import java.util.Arrays;

class FindOccurence {
    public static void main(String[] args) {

        int A[] = { 4, 5, 4, 7, 2, 1, 4, 5, 9, 9, 9 };
        Arrays.sort(A);
        System.out.println((binarySearchAlgoRight(A, A.length, 4) - binarySearchAlgoLeft(A, A.length, 4)) + 1);

    }

    public static int binarySearchAlgoLeft(int[] A, int n, int k) {

        int low = 0, high = n - 1;
        int mid = (low + high) / 2;
        int ans = 0;

        while (low <= high) {
            if (A[mid] == k) {
                high = mid - 1;
                ans = mid;

            } else if (k > A[mid])
                low = mid + 1;
            else
                high = mid - 1;

            mid = (low + high) / 2;

        }
        return ans;
    }

    public static int binarySearchAlgoRight(int[] A, int n, int k) {

        int low = 0, high = n - 1;
        int mid = (low + high) / 2;
        int ans = 0;

        while (low <= high) {
            if (A[mid] == k) {
                low = mid + 1;
                ans = mid;

            } else if (k > A[mid])
                low = mid + 1;
            else
                high = mid - 1;
            mid = (low + high) / 2;

        }
        return ans;
    }

}
