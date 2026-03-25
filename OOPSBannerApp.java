import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        });

        charMap.put('P', new String[]{
            "******  ",
            "**   ** ",
            "**   ** ",
            "******  ",
            "**      ",
            "**      ",
            "**      ",
            "**      "
        });

        charMap.put('S', new String[]{
            "  ***** ",
            " **     ",
            "**      ",
            "  ***   ",
            "     ** ",
            "      **",
            " **   **",
            "  ***** "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length;
        String[] lines = new String[patternHeight];

        for (int i = 0; i < patternHeight; i++) {
            lines[i] = "";
        }

        for (char ch : message.toCharArray()) {
            String[] pattern = charMap.get(ch);

            for (int i = 0; i < patternHeight; i++) {
                lines[i] += pattern[i] + "  ";
            }
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
