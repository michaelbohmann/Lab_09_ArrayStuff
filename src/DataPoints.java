import java.util.Random;
import java.util.Scanner;

class ArrayStuff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }


        System.out.print("Data Points: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }


        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;


        System.out.println("\nSum of dataPoints: " + sum);
        System.out.printf("Average of dataPoints: %.2f%n", average);


        System.out.print("\nEnter an integer value between 1 and 100: ");
        int userValue = SafeInput.getRangedInt(scanner, "", 1, 100);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The user's value " + userValue + " was found " + count + " times in the array.");


        System.out.print("\nEnter another integer value between 1 and 100: ");
        userValue = SafeInput.getRangedInt(scanner, "", 1, 100);

        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position);
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }


        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        scanner.close();
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
