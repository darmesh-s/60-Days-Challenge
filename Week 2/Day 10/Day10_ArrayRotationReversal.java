import java.util.Scanner;

public class Day10_ArrayRotationReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        k = k % n;

        // Step 1
        reverse(arr, 0, k - 1);

        // Step 2
        reverse(arr, k, n - 1);

        // Step 3
        reverse(arr, 0, n - 1);

        System.out.println("Array after rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}