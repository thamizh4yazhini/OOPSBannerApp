import java.util.HashMap;
import java.util.Map;

public class UC8{

    // Centralized Map Storage
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static Block to Initialize Patterns
    static {

        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });
    }

    // Render Function
    public static void renderBanner(String text) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (char ch : text.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("OOPS Banner using HashMap:\n");

        renderBanner("OOPS");
    }
}