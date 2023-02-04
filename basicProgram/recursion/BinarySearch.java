package recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int A[] = { 1, 2, 4, 5 };
        int x = 5;
        System.out.print(binarySearch(A, x));
    }

    public static int binarySearch(int[] arr, int x) {

        int mid = (arr.length - 1) / 2;

        return search(arr, 0, mid, arr.length - 1, x);

    }

    public static int search(int A[], int l, int mid, int r, int x) {

        System.out.println(l + "  " + r + "  " + mid);
        if (l > r)
            return -1;

        if (A[mid] == x)
            return mid;

        if (x < A[mid]) {
            r = mid - 1;

        } else
            l = mid + 1;

        mid = (l + r) / 2;

        System.out.println(l + "  " + r + "  " + mid);
        return search(A, l, mid, r, x);
    }

}
