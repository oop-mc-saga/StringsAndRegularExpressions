package example;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tadaki
 */
public class RegexSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dates[] = {"20100401", "20110530", "20101109",
            "19991010", "19890321", "Aug5,2019", "2010Sep9"};
        Pattern p = Pattern.compile("((\\d{4})(\\d\\d)(\\d\\d))");
        for (String d : dates) {
            Matcher m = p.matcher(d);
            while (m.find()) {
                String str = m.group(1);
                String year = m.group(2);
                String month = m.group(3);
                String day = m.group(4);
                StringJoiner sj = new StringJoiner("/", "(", ")");
                sj.add(year).add(month).add(day);
                System.out.println(str + "->" + sj.toString());
            }
        }
    }

}
