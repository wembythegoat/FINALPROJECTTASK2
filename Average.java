import java.util.Scanner;

public class Average {
    private int[] data;
    private double mean;

    public Average() {
     Scanner sc = new Scanner(System.in);
        data = new int[5];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter a score: " + (i + 1));
            data [i] = sc.nextInt();
        }
        calculateMean();
        selectionSort();
    }
    public void calculateMean() {
        double total = 0;
        for (int score:data) {
            total += score;
        }
        mean = total/ data.length;
    }
    public String toString() {
        String result = "Descending order of the data";
        for (int i = 0; i < data.length - 1; i++) {
            result += data[i] + " ";
        }
        result += "\nMean: " + mean;
        return result;
    }
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int k = i + 1; k < data.length; k++) {
                if (data [k] > data[maxIndex]) {
                    maxIndex = k;
                }
            }
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;

        }

    }
}
