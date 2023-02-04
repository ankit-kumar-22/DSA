public class pattern12 {
    public static void main(String[] args) {
        int row = 4;
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j < k)

                    System.out.print(' ' + " ");
                else
                    System.out.print(" "+(j+1));

            }
            k++;
            System.out.println();
        }
    }
}