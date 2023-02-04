package recursion;

class powerOfTwo {
    public static void main(String[] args) {
        System.out.print(getPowerOfTwo(6));

    }

    public static int getPowerOfTwo(int n) {
        if (n == 0)
            return 1;

        return 2 * getPowerOfTwo(n - 1);
    }

}
