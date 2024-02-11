Input : 1213
Output : One Thousand Two Hundred and Thirteen


import java.util.*;

public class number_to_numbervalue {

    private static final String[] UNIT_NAMES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    private static final String[] TEENS_NAMES = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS_NAMES = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String[] convertNumbersToWords(String input) {
        String[] tokens = input.split("\\s+");
        String[] result = new String[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            try {
                int number = Integer.parseInt(tokens[i]);
                if (number < 0 || number > 99999) {
                    result[i] = "Out of range: " + number;
                } else {
                    result[i] = convertNumberToWord(number);
                }
            } catch (NumberFormatException e) {
                result[i] = "Invalid input: " + tokens[i];
            }
        }

        return result;
    }

    private String convertNumberToWord(int number) {
        if (number == 0) {
            return "Zero";
        } else if (number < 10) {
            return UNIT_NAMES[number];
        } else if (number < 20) {
            return TEENS_NAMES[number - 10];
        } else if (number < 100) {
            return TENS_NAMES[number / 10] + " " + convertNumberToWord(number % 10);
        } else if (number < 1000) {
            return UNIT_NAMES[number / 100] + " Hundred " + convertNumberToWord(number % 100);
        } else if (number < 10000) {
            return convertNumberToWord(number / 1000) + " Thousand " + convertNumberToWord(number % 1000);
        } else if (number < 100000) {
            return TENS_NAMES[number / 1000] + " - " + convertNumberToWord(number % 1000);
        } else {
            return "Invalid number range";
        }
    }

    public static void main(String[] args) {
    	number_to_numbervalue converter = new number_to_numbervalue();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] result = converter.convertNumbersToWords(input);
        for (String str : result) {
            System.out.println(str);
        }
        scanner.close();
    }
}
