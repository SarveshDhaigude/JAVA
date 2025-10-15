// CustomerID1.java
import java.util.Scanner;

public class LinearSearch {

    public static int customerID(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of customers in an E-Commerce System:");
        int size = sc.nextInt();
        int A[] = new int[size];

        System.out.println("Enter the Customer Account IDs:");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Customer Account IDs are displayed as:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println("\n");

        System.out.println("Enter the Customer Account ID to be found:");
        int x = sc.nextInt();

        int result = customerID(A, x);

        if (result == -1) {
            System.out.println("Customer Account ID " + x + " is not found.");
        } else {
            System.out.println("Customer Account ID " + x + " is found at index: " + result);
        }

        sc.close();
    }
}
