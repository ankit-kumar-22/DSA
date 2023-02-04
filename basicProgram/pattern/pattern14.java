public class pattern14 {
    public static void main(String[] args) {
        int row = 4;
        int col = (2 * row - 1);
        int leftSpace = (col - 1) / 2;
        int rightSpace = (col - leftSpace);

        for (int i = 0; i < row; i++) {
            int counter = 1;
            for (int j = 0; j < col; j++) {

                if ((j < leftSpace))
                    System.out.print("_ ");
                else if (j >= leftSpace && j < rightSpace) {

                    System.out.print(counter + " ");
                    if (j<((col - 1) / 2))
                        ++counter;
                    else
                        --counter;
                }

                else
                    System.out.print("_ ");

            }
            leftSpace--;
            rightSpace++;
            System.out.println();
        }
    }
}