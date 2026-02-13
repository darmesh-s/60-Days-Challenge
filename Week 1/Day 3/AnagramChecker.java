import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams ❌");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are Anagrams ✅");
        } else {
            System.out.println("Not Anagrams ❌");
        }
    }
}
 
