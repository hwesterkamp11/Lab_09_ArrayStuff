import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int similarValue = SafeInput.getRangedInt(scan, "Enter your integer between 1 and 100", 1, 100);

        int[] datapoints = new int[100];
        boolean wrongInput = false;

        for(int i = 0; i < datapoints.length; i++) {
            datapoints[i] = rand.nextInt(100) + 1;
        } for(int i = 0; i < datapoints.length; i++) {
            if(i < datapoints.length - 1) {
                System.out.print(datapoints[i] + " | ");
            } else {
                System.out.print(datapoints[i]);
            }
        }

        int sum = 0;
        for(int i = 0; i < datapoints.length; i++) {
            sum = datapoints[i] + sum;
        }
        System.out.println();
        System.out.println();

        double average = sum / datapoints.length;
        System.out.println("The sum of the datapoints is " + sum + " and the average is " + average + ".");
        int max = 0;
        int min = 100;
        for(int i = 1; i < datapoints.length; i++) {
            int j = i - 1;
            if(datapoints[i] >= datapoints[j]) {
                if(datapoints[i] > max) {
                    max = datapoints[i];
                } else if(datapoints[j] < min) {
                    min = datapoints[j];
                }
            } else if(datapoints[i] < datapoints[j]) {
                if(datapoints[i] < min) {
                    min = datapoints[i];
                } else if(datapoints[j] > max) {
                    max = datapoints[j];
                }
            }
        } for(int i = 0; i < datapoints.length; i++) {
            if(datapoints[i] == max) {
                System.out.println("There is a maximum value of " + max + " at " + i + ".");
            } else if(datapoints[i] == min) {
                System.out.println("There is a minimum value of " + min + " at " + i + ".");
            }
        }

        System.out.println();

        for(int i = 0; i < datapoints.length; i++) {
            if(similarValue == datapoints[i]) {
                System.out.println("The value " + similarValue + " entered is found at array index " + i + ".");
                wrongInput = true;
            } else {
            }
        } if(wrongInput == false) {
            System.out.println("There were no similar values found in the array.");
        }

        System.out.println();

        System.out.println("The average of datapoints is: " + getAverage(datapoints));
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for(int value : values) {
            sum = value + sum;
        }
        return (double) sum / values.length;
    }
}
