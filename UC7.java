
public class OOPSBannerApp {

 
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

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


    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
            "  *** ", " * * ", "* *", "* *", "* *", " * * ", "  *** "
        });
        charMaps[1] = new CharacterPatternMap('P', new String[]{
            " @@@@@ ", " @    @", " @    @", " @@@@@ ", " @     ", " @     ", " @     "
        });
        charMaps[2] = new CharacterPatternMap('S', new String[]{
            "  @@@@ ", " @     ", " @     ", "  @@@@ ", "      @", "      @", "  @@@@ "
        });
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return charMaps;
    }



    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int linesPerCharacter = 7;
        for (int i = 0; i < linesPerCharacter; i++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                bannerLine.append(pattern[i]).append("  ");
            }
            System.out.println(bannerLine.toString());
        }
    }


    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}