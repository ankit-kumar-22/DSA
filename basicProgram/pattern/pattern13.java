package pattern;
public class pattern13 {
    public static void main(String[] args) {
        int row = 3;
        int k = row - 1;
        int temp = 0;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < row; j++) {
                if (j < k)
                    System.out.print(' ' + " ");
                else {
                    System.out.print(" " + (temp + 1));
                    temp++;
                }

            }
            k--;
            System.out.println();
        }
    }
}