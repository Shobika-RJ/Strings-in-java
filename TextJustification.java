Input :
Text = Zoho_Corp_Madurai //(length is 17)
Padding = 25
Space between the strings should be evenly distributed
Output :
Zoho__Corp__Madurai //(length is 25)


public class TextJustification {
    public static void main(String[] args) {
        String text = "Zoho_Corp_Madurai";
        int desiredLength = 25;

        String justifiedText = justifyText(text, desiredLength);
        System.out.println("Input: " + text);
        System.out.println("Output: " + justifiedText);
    }

    private static String justifyText(String text, int desiredLength) {
        String[] words = text.split("_");
        int numberOfSpaces = words.length - 1;
        int totalSpacesToAdd = desiredLength - text.length();

        if (numberOfSpaces == 0) {
            // No spaces to distribute
            return text;
        }

        int spacesToAddPerWord = totalSpacesToAdd / numberOfSpaces;
        int extraSpaces = totalSpacesToAdd % numberOfSpaces;

        StringBuilder justifiedText = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < spacesToAddPerWord; j++) {
                justifiedText.append(' ');
            }

            if (extraSpaces > 0) {
                justifiedText.append(' ');
                extraSpaces--;
            }

            justifiedText.append(words[i]);
        }

        return justifiedText.toString();
    }
}
