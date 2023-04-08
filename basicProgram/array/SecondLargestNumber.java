package array;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int A[]={16,19,43,21,25,3,5,8,10,56};
        int largest=A[0];
        int secondLargest=A[1];
        for(int i=2;i<A.length;i++){
            if(largest<A[i]){
                secondLargest=largest;
                largest=A[i];

            }
        }
        System.out.println(largest+"  "+secondLargest);
    }
}
