package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tadaki
 */
public class RegexExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "0010111010011";
        //Define regular expression
        Pattern p = Pattern.compile("101+");
        Matcher m = p.matcher(input);
        int c = 0;//starting point of matching
        while (m.find(c)) {//matching by starting point
            c = m.start();//matched point
            String s = m.group();
            System.out.println("matches "+s + " at " + c);
            c++;//next matching
        }
    }

}
