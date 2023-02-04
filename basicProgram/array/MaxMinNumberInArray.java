package array;

class MaxMinNumberInArray {

    public static void main(String[] args) {
        int A[] = { 4, 134, 12, -56, 7, 8, 39, 2, 3 };
        int min = A[0], max = A[A.length - 1];
        for (int i = 0; i < A.length; i++) {
            if (max <= A[i]) {
                int temp = A[i];
                A[i] = max;
                max = temp;

            }

            if (min >= A[i]) {
                int temp = A[i];
                A[i] = min;
                min = temp;
            }
        }
        System.out.println(max + "  " + min);
    }
}
