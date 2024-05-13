package question1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int searchNum = scanner.nextInt();

        int count = 0;
        for (int num : numbers) {
            if (num == searchNum) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + searchNum + " is present in the array " + count + " times.");
        } else {
            System.out.println("The number " + searchNum + " is not present in the array.");
        }
    }
}


