public class pattern11 {
    public static void main(String[] args) {
        int row = 5;
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if(j<k)
                System.out.print(' '+" ");
                else
                System.out.print(" *");
             
            }
            k++;
            System.out.println();
        }
    }
}