package examples;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tadaki
 */
public class RegexExample2 {

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
                int n = m.groupCount();//number of matched positions
                StringJoiner sj = new StringJoiner("/");
                String str = m.group(1);
                for(int i=2;i<=n;i++){
                    sj.add(m.group(i));
                }
                System.out.println(str + " -> " + sj.toString());
            }
        }
    }

}
