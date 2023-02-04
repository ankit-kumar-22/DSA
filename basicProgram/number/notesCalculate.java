package number;

public class notesCalculate {

    public static void main(String[] args) {

        int amount = 1429;

        int noteCount100 = amount / 100;
        if (noteCount100 != 0)
            amount = amount - (noteCount100 * 100);

        int noteCount50 = amount / 50;
        if (noteCount50 != 0)
            amount = amount - (noteCount50 * 50);

        int noteCount20 = amount / 20;
        if (noteCount20 != 0)
            amount = amount - (noteCount20 * 20);

        int noteCount1 = amount / 1;
        if (noteCount1 != 0)
            amount = amount - (noteCount1 * 1);

        System.out.println("100 Notes==" + noteCount100 + " 50 Notes==" + noteCount50 + " 20 Notes== "
                + noteCount20 + " 1 Notes==" + noteCount1);

    }
}
