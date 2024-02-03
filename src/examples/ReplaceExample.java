package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tadaki
 */
public class ReplaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "001011101001101";
        //Define regular expression
        Pattern p = Pattern.compile("101+");
        Matcher m = p.matcher(input);
        //Simple replacement
        System.out.println(m.replaceFirst("121"));
        System.out.println(m.replaceAll("121"));
        //Using matched string
        System.out.println(m.replaceAll("_$0_"));
        //Using matched position
        p = Pattern.compile("(10)(1+)");
        m = p.matcher(input);
        System.out.println(m.replaceAll("12$2"));
    }

}
