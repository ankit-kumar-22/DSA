package number;

public class reverseNumber {

    public static void main(String[] args) {
        int x = 145;
        int ans = 0;
        while (x != 0) {
            ans = ans * 10 + (x % 10);
            x = x / 10;

        }
        System.out.println(ans);
    }
}
