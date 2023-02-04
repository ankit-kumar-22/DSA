package binarySearchApplication;

class SquareRootInDecimal {
    public static void main(String[] args) {

        int ans = getSqrtIntegerPart(8);
        System.out.println(getSqrtFirstPrecisonPart(ans, 8)-0.1);

    }

    public static int getSqrtIntegerPart(int k) {
        long low = 1;
        long high = k / 2;
        long mid = (low + high) / 2;
        while (low <= high) {
            if (((mid) * (mid) <= k) && ((mid + 1) * (mid + 1) > k))
                return (int) mid;
            else if ((mid) * (mid) < k)
                low = mid + 1;
            else
                high = mid - 1;
            mid = (low + high) / 2;
        }

        if (k == 0)
            return 0;
        return 1;

    }

    public static double getSqrtFirstPrecisonPart(int k, int num) {
        double ans = 0.1 + k;

        while (true) {
            if (ans * ans < (num))
                ans = ans + 0.1;
            else
                break;
            // System.out.println(ans+"**********");
        }
        return ans;
    }

}
