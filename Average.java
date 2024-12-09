import java.util.Scanner;

public class Average {
    // Instance variables
    private int[] data;
    private double mean;

    // Constructor to initialize the data array and calculate the mean
    public Average() {
     Scanner sc = new Scanner(System.in);

        // Initialize the data array to hold 5 int
        data = new int[5];
        for (int i = 0; i < data.length; i++) {
            // Prompt user for input
            System.out.print("Enter a score: " + (i + 1));
            // Store the input in the array
            data [i] = sc.nextInt();
        }

        // Call the method to calculate the mean of the data
        calculateMean();
        // Call the method to sort the data in descending order
        selectionSort();
    }

    // Method to calculate the mean of the data array
    public void calculateMean() {
        double total = 0;

        for (int score:data) {
            // Sum all the scores
            total += score;
        }
        // Calculate the mean by dividing the total by the number of scores
        mean = total/ data.length;
    }

    // Method to return a string representation in descending order
    public String toString() {
        String result = "Descending order of the data";

        for (int i = 0; i < data.length - 1; i++) {
            // Appends each score to the result string
            result += data[i] + " ";
        }

        // Append the mean to the result string
        result += "\nMean: " + mean;
        // Return the result string
        return result;
    }

    // Method to sort the data array in descending order
    public void selectionSort() {

        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int k = i + 1; k < data.length; k++) {
                // Find the maximum element in the unsorted part of the array
                if (data [k] > data[maxIndex]) {
                    maxIndex = k;
                }
            }

            // Swap the found maximum element with the first element
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;

        }

    }
}
