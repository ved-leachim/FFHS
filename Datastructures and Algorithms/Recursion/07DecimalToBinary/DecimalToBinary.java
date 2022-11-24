public class DecimalToBinary {

    public static void main(String[] args) {
        int binary = decimalToBinary(-126);
        System.out.println(binary);
    }

    public static int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        return decimal % 2 + 10 * decimalToBinary(decimal / 2);
    }

}
