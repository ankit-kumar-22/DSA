package array;

class reverseArray {
    public static void main(String[] args) {
        int A[] = { 23, 45, 12, 1, 2, 3 };
        int leftIndex = 0, rightIndex = A.length - 1;
        int mid = (A.length) / 2;
        while (leftIndex != mid) {
            int temp = A[rightIndex];
            A[rightIndex] = A[leftIndex];
            A[leftIndex] = temp;
            leftIndex++;
            rightIndex--;
        }

        for (int value : A)
            System.out.print(value + "  ");
    }

}
