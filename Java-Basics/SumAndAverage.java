import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = s.nextInt();
            
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            double average = (double) sum/n;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
