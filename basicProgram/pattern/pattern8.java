public class pattern8 {
    public static void main(String[] args) {
        int row = 3;

        for (int i = 0; i <= row; i++) {
            int k=(row-i)+65;
            for (int j = 0; j <=i; j++) {
                    System.out.print((char)k+" ");
                    k++;
            }
          
            System.out.println();
        }
    }
}