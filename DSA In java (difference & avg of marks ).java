import java.util.Scanner;

public class AvgDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int bottom = (arr[0] + arr[1] + arr[2]) / 3;
        int top = (arr[n - 1] + arr[n - 2] + arr[n - 3]) / 3;
        int diff = top - bottom;

        System.out.println(bottom);
        System.out.println(top);
        System.out.println(diff);
    }
}
