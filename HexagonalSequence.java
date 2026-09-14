public class HexagonalSequence {
    public static void main(String[] args) {
        int n = 5; // Number of terms in the hexagonal sequence

        System.out.println("Hexagonal Sequence:");
        for (int i = 1; i <= n; i++) {
            int hexagonalNumber = i * (2 * i - 1); // Formula for the nth hexagonal number
            System.out.print(hexagonalNumber + " ");
        }
    }
}
