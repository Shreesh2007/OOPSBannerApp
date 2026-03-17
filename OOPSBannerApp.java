public class OOPSBannerApp {

    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] getCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', getOPattern()),
            new CharacterPatternMap('P', getPPattern()),
            new CharacterPatternMap('S', getSPattern())
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        String[] lines = new String[8];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = "";
        }

        for (char ch : message.toCharArray()) {
            String[] pattern = getCharacterPattern(ch, charMaps);

            if (pattern != null) {
                for (int i = 0; i < pattern.length; i++) {
                    lines[i] += pattern[i] + "   ";
                }
            }
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = getCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }

    // ✅ These must be INSIDE the class
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            "******  ",
            "**   ** ",
            "**   ** ",
            "******  ",
            "**      ",
            "**      ",
            "**      ",
            "**      "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  ***** ",
            " **     ",
            "**      ",
            "  ***   ",
            "     ** ",
            "      **",
            " **   **",
            "  ***** "
        };
    }
}
