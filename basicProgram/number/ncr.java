package number;

class ncr {
    public static void main(String[] args) {
        int n = 8;
        int r = 2;
        System.out.println(calcuateNCR(n, r));
    }

    public static int calcuateNCR(int n, int r) {
        return getFactorial(n) / (getFactorial(r) * getFactorial(n - r));
    }

    public static int getFactorial(int num) {
        if (num == 0)
            return 1;

        return num * getFactorial(num - 1);
    }

}
