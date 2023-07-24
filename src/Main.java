import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SIZE = 100;
        int[] dataPoints = new int[SIZE];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for (int x = 0; x < dataPoints.length; x++){
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for (int x = 0; x < dataPoints.length; x++){
            System.out.printf("%5d" + " | ", dataPoints[x]);
        }
        int sum = 0;
        for (int x = 0; x < dataPoints.length; x++){
            sum = sum + dataPoints[x];
        }
        int avg = sum / dataPoints.length;
        System.out.println("\nThe sum of all of the integers in the random array dataPoints is:" + sum);
        System.out.println("The average of the random array dataPoints is:" + avg);

        // Part 2 Linear Scan

        int
    }
}