public 

class TriangleSequence {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the triangle sequence

        for (int i = 1; i <= n; i++) {
            int num = 1; // First number in each row is always 1
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / j; // Calculate the next number in the row
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
