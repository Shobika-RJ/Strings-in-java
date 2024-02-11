import java.util.Map;

public class VowelCount {
    public static void main(String[] args) {
        String input = "India";
        System.out.println("Input: " + input);

        Map<Character, Integer> vowelCount = countVowels(input);
        System.out.println("Output:");
        for (char vowel : "aeiouAEIOU".toCharArray()) {
            System.out.println(vowel + ": " + vowelCount.getOrDefault(vowel, 0));
        }
    }

    private static Map<Character, Integer> countVowels(String str) {
        Map<Character, Integer> vowelCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
            }
        }

        return vowelCount;
    }
}
