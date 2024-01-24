import java.io.*;
import java.util.* ; 
public class Fibonaaci {
    public static void main(String[] args) {
        int n = 10; // Adjust the value of 'n' as needed

        // Initialize an array to store Fibonacci numbers
        int[] fibonacci = new int[n];

        // Base cases
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculate Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci sequence
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
