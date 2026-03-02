/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * * This class extends UC2 by utilizing String.join() for better readability
 * and efficiency, overcoming drawbacks of the + operator.
 * * @author Developer
 * @version 3.0
 */
public class UC3{

    public static void main(String[] args) {
        // Constructing each line using String.join() for efficiency
        System.out.println(String.join(" ", "  *** ", "    *** ", " ***** ", "  ***** "));
        System.out.println(String.join(" ", " ** **", "   ** **", " **   **", " ** "));
        System.out.println(String.join(" ", "**   ** ", "**   ** ", "**  ** ", "** "));
        System.out.println(String.join(" ", "**   ** ", "**   ** ", "***** ", " ***** "));
        System.out.println(String.join(" ", "**   ** ", "**   ** ", "** ", "        **"));
        System.out.println(String.join(" ", " ** **", "  **  **", "  ** ", "   ** **"));
        System.out.println(String.join(" ", "  *** ", "    *** ", "  ** ",   " ***** "));
    }
}