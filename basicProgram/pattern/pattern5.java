public class pattern5 {
    public static void main(String[] args) {
        int row=3;
        int k=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                k=k+1;
                System.out.print(k+" ");
            }            
            System.out.println();
        }
    }    
}
