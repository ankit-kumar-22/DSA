package array;

class sort01 {
    public static void main(String[] args) {
        int A[] = { 0, 1, 1, 0, 0, 1 };
        int l = 0, r = A.length - 1;
        while (l < r) {
            while (A[l] == 0 && l < r)
                l++;

            while ((A[r] == 1 || A[r] == r) && l < r)
                r--;

            if (l < r) {
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
                l++;
                r--;
            }
        }

        for (int value : A)
            System.out.print(value + " ");
        // sort012(A);
    }

    public static void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else
                count2++;
        }

        int k = 0;
        while (count0 != 0) {
            arr[k] = 0;
            k++;
            count0--;
        }
        while (count1 != 0) {
            arr[k] = 1;
            k++;
            count1--;
        }
        while (count2 != 0) {
            arr[k] = 2;
            k++;
            count2--;
        }

        for (int value : arr)
            System.out.print(value + " ");

    }

}
