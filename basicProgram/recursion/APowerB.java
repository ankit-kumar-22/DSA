package recursion;

class APowerB {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.print(aPowerb(a, b));

    }

    public static int aPowerb(int a, int b) {

        if (b == 0)
            return 1;

        if (b == 1)
            return a;

        if ((b & 1) == 0) // if power is even
            return (int) Math.pow(aPowerb(a, b / 2), 2);
        else
            return (int) Math.pow(aPowerb(a, b / 2), 2) * a;

    }
}
