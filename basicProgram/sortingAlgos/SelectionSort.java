package sortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int A[] = { 64, 25, 12, 22, 11 };
        for (int i = 0; i < A.length; i++) {
            int min_index = find_min(A, i, A.length);
            int temp = A[i];
            A[i] = A[min_index];
            A[min_index] = temp;
        }

        for (int val : A)
            System.out.print(val + " ");

    }

    public static int find_min(int A[], int s, int e) {
        int ans = s, min = A[s];
        for (int i = s; i < e; i++) {
            if (min >= A[i]) {
                min = A[i];
                ans = i;
            }
        }

        return ans;
    }

}
