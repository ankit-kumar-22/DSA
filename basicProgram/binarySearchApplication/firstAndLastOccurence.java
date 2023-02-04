package binarySearchApplication;

import java.util.ArrayList;

class firstAndLastOccurence {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        firstAndLastPosition(list, 8, 2);
    }

    public static void firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        System.out.println(binarySearchAlgoLef(arr, n, k) + "   " + binarySearchAlgoRight(arr, n, k));

    }

    public static int binarySearchAlgoLef(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        int ans = -1;
        while (low <= high) {
            if (k == arr.get(mid)) {
                ans = mid;
                high = mid - 1;
            } else if (k > arr.get(mid)) {
                low = mid + 1;
            } else
                high = mid - 1;

            mid = (low + high) / 2;
        }

        return ans;
    }

    public static int binarySearchAlgoRight(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        int ans = -1;
        while (low <= high) {
            if (k == arr.get(mid)) {
                ans = mid;
                low = mid + 1;
            } else if (k > arr.get(mid)) {
                low = mid + 1;
            } else
                high = mid - 1;

            mid = (low + high) / 2;
        }

        return ans;
    }

}
