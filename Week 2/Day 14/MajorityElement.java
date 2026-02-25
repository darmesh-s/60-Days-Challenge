import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int majority = findMajority(arr);

        System.out.println("Majority Element: " + majority);
    }

    public static int findMajority(int[] arr) {

        int candidate = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}