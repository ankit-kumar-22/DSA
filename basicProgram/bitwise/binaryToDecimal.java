package bitwise;

public class binaryToDecimal {
    public static void main(String[] args) {
        String x="1000000";
        int i=x.length()-1,ans=0,index=0;
        while(i>=0)
        {
            ans=ans+(int)(Math.pow(2,i)*Integer.parseInt(x.split("")[index]));
            i--;
            index++;
        }
        System.out.println(ans);
    }
    
}
