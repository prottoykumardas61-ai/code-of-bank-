public class AverageCalculator {

    public static double average(double... numbers) {
        if (numbers.length == 0) {
            return 0; // No arguments provided
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    // Demonstration
    public static void main(String[] args) {
        System.out.println("Average (5, 10) = " + average(5, 10));
        System.out.println("Average (2, 4, 6, 8) = " + average(2, 4, 6, 8));
        System.out.println("Average (1, 2, 3, 4, 5, 6) = " + average(1, 2, 3, 4, 5, 6));
        System.out.println("Average (no arguments) = " + average());
    }
}
