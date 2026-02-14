import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day04_CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {

            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        System.out.println("\nCharacter Frequencies:");

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
