//The following program, ArrayCopyDemo, declares an array of String elements.
//It uses the System.arraycopy method to copy a subsequence of array
//components into a second array:
public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println("-----------------");
        String[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 0, 13);
        for (String coffee : copyTo1) {
            System.out.print(coffee + " ");
        }
    }
}
