package recursion;

class ReverseString {
    public static void main(String[] args) {

        String input = "9191";
        int l = 0;
        int r = input.length() - 1;
        String rev = reverseString(input, l, r);
        System.out.println(rev);
        System.out.println(checkPalinDrome(input, rev));

    }

    public static String reverseString(String s, int l, int r) {

        if (l >= r)
            return s;
        StringBuilder stringBuilder = new StringBuilder(s);

        char temp = stringBuilder.charAt(l);
        stringBuilder.setCharAt(l, stringBuilder.charAt(r));
        stringBuilder.setCharAt(r, temp);

        return reverseString(stringBuilder.toString(), l + 1, r - 1);
    }

    public static boolean checkPalinDrome(String l, String r) {
        return l.equals(r);
    }

}
