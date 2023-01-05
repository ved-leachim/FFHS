public class RussianDolls {

    public static void main(String[] args) {
        openBabuschka(10);
    }

    public static void openBabuschka(int babuschkaCount) {
        // Check if there is another Babuschka inside
        if (babuschkaCount == 0) {
            System.out.println("All Babuschkas are opened.");
        }
        // Open Babuschka and bring the one from inside in place
        else {
            System.out.println("There are still " + babuschkaCount + " Babuschkas to open.");
            openBabuschka(babuschkaCount - 1);
        }
    }
}
