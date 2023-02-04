package array;

class swapAlternate {

    public static void main(String[] args) {
        int A[] = { 1, 2, 7, 8, 5 };
        for(int i=0;i<A.length-1;i=i+2)
        {
            int temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
        }

        for(int value:A)
        System.out.print(value+" ");

    }

}
