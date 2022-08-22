import java.util.Random;

public class MaxAndMin {

    // Program which finds the maximum and minimum value in an array with random values in it
    public static void main(String[] args) {
        // Initialise variables
        int numbers[] = new int[10];
        Random rand = new Random(); // Random number generator

        // This loop fills the array with random variables from 0 to 20
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(0, 20);
            System.out.print(numbers[i] + "  ");
        }
        // Initialise max and min variables now that numbers has values inside it
        int minValue = numbers[0];
        int maxValue = numbers[0];

        // Loop that checks for Max and Min
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue)
                maxValue = numbers[i];
            if (numbers[i] < minValue)
                minValue = numbers[i];
        }

        // Outputs
        System.out.println();
        System.out.println("The Maximum value in the array is: " + maxValue);
        System.out.println("The Minimum value in the array is: " + minValue);
    }
}
