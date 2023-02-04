public class pattern7 {
    public static void main(String[] args) {
        int row = 4;
        int start=65;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <=i; j++) {
                    System.out.print((char)start+" ");
                    start++;
            }
          
            System.out.println();
        }
    }
}