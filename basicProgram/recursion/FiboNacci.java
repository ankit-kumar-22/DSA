package recursion;

class FiboNacci {
    public static void main(String[] args) {

        int n = 5;

        System.out.println(getFiboNacciNumber(n - 1));

    }

    public static int getFiboNacciNumber(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return getFiboNacciNumber(n - 1) + getFiboNacciNumber(n - 2);
    }

}
