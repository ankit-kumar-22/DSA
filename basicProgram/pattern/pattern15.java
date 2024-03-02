package pattern;
public class pattern15 {
    public static void main(String[] args) {
        int row = 5;
        int counter=5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(j<=counter)
                System.out.print(j + "\t");
                else
                System.out.print("*\t");

            }
         
            
            for (int j = row; j >= 1; j--) {
                if(j<=counter)
                System.out.print(j + "\t");
                else
                System.out.print("*\t");

            }


            counter--;
            System.out.println();
        }
        
    }
}