package bitwise;

public class positiveDecimalToBinary {

    public static void main(String[] args) {
        int n = 8, ans = 0,i=0;

        while (n > 0) {
           
            int rem=(n&1);
            ans=ans+(rem*(int)Math.pow(10, i));
            
            n = n/2;
            i++;

        }
        System.out.println(ans);
      

    }
}
