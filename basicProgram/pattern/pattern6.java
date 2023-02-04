public class pattern6 {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 0; i < row; i++) {
            int k = i;
            for (int j = 0; j <= i; j++) {
                k = k + 1;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}