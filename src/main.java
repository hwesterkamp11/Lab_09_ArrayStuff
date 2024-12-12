import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] datapoints = new int[100];

        for(int i = 0; i < datapoints.length; i++) {
            datapoints[i] = rand.nextInt(100) + 1;
        } for(int i = 0; i < datapoints.length; i++) {
            System.out.println("datapoints[" + i + "] = " + datapoints[i]);
        }
    }
}
