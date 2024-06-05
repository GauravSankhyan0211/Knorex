public class solutionTwo {
    public static void main(String[] args) {
        printSeries(0, 2, 10); // Example 1
        printSeries(5, 3, 5);   // Example 2
    }

    public static void printSeries(int a, int b, int n) {
        int sum = a;
        System.out.print(sum + " "); // Print the first term
        int multiplier = 1;
        for (int i = 1; i < n; i++) {
            sum += multiplier * b; // Add the next term to the sum
            multiplier *= 2; // Update the multiplier
            System.out.print(sum + " "); // Print the current term
        }
        System.out.println(); // Move to the next line after printing the series
    }
}