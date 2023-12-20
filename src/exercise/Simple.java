package exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tadaki
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "1100100100001";
        Pattern p = Pattern.compile("1(00)+1");//Define regular expression
        Matcher m = p.matcher(input);
        int k = 0;
        while (m.find(k)) {
            k = m.start();
            String s = String.valueOf(k) + " : " + m.group();
            System.out.println(s);
            k++;
        }
    }

}
