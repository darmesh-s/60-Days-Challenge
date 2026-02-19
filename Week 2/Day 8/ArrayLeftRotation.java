import java.util.Scanner;

public class ArrayLeftRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n <= 1) {
            System.out.println("Rotation not needed.");
            return;
        }

        int first = arr[0];  // Store first element

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];  // Shift left
        }

        arr[n - 1] = first;  // Place first at end

        System.out.println("Array after left rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
