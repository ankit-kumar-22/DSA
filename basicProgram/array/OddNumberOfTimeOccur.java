package array;

public class OddNumberOfTimeOccur {
    public static void main(String[] args) {
  int[] A={20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
     int ans=0;
     for(int val:A)
         ans=ans^val;

        System.out.println(ans);
    }
}
