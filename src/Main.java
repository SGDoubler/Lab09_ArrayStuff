import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static double getAverage(int values[])
    {
        double sum = 0.0;
        for (double x : values){
            sum += x;
        }
        return sum / values.length;
    }
    public static int min(int values[])
    {
        int min = 0;

        for(int x = 0; x < values.length; x++)
        {
            if (min > values[x])
            {
                min = values[x];
            }
        }
        return min;
    }
    public static int max(int values[])
    {
        int max = 0;
        for(int x = 0; x < values.length; x++)
        {
            if (max < values[x])
            {
                max = values[x];
            }
        }
        return max;
    }
    public static int occuranceScan(int values[], int target)
    {
        int count = 0;
        for (int x = 0; x < values.length; x++) {
            if (values[x] == target){
                count++;
            }
        }
        return count;
    }
    public static int sum(int values[])
    {
        int sum = 0;
        for (int x = 0; x < values.length; x++){
            sum = sum + values[x];
        }
        return sum;
    }
    public static boolean contains(int values[], int target)
    {
        Scanner pipe = new Scanner(System.in);
        target = SafeInput.getRangedInt(pipe, "Pick another number between 1 and 100", 1, 100);
        boolean targetFound = false;
        for (int x = 0; x < values.length; x++) {
            if (values[x] == target) {
                targetFound = true;
                System.out.println("The value " + target + " was found in the array at position " + x);
                break;
            }
        }
        return targetFound;
    }
    public static void main(String[] args)
    {
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
        System.out.println("\nThe sum from the public static method is:" + sum(dataPoints));
        System.out.println("The average of the random array dataPoints is:" + avg);

        // Part 2 Linear Scan

        int userIn = SafeInput.getRangedInt(in,"Pick a number between 1 and 100",1,100);
        int count = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == userIn){
                count++;
            }
        }
        System.out.println("Your number matched a number in the array:" + count + " times");
        int valPos = SafeInput.getRangedInt(in, "Pick another number between 1 and 100",1,100);
        boolean targetFound = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == valPos) {
                targetFound = true;
                System.out.println("The value " + valPos + " was found in the array at position " + x);
                break;
            }
        }
        if (!targetFound){
                System.out.println("The value:" + valPos + " was not found!");
        }
        System.out.print("The method \"contains\" indicates your number was contained in the array " + contains(dataPoints,SafeInput.getRangedInt(in,"Pick a number between 1 and 100",1,100)));

        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int x = 0 ; x < dataPoints.length; x++)
        {
            if (min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if (max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("\nThe Min is " + min + " and the max is " + max);
        System.out.println("\nThe min from the public static method is:" + min(dataPoints));
        System.out.println("\nThe max from the public static method is:" + max(dataPoints));

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));


    }
}