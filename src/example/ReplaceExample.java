package example;

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
        //正規表現の定義
        Pattern p = Pattern.compile("101+");
        Matcher m = p.matcher(input);
        //単純な置き換え
        System.out.println(m.replaceFirst("121"));
        System.out.println(m.replaceAll("121"));
        //一致した文字列の利用
        System.out.println(m.replaceAll("_$0_"));
        //一致した部分の指定
        p = Pattern.compile("(10)(1+)");
        m = p.matcher(input);
        System.out.println(m.replaceAll("12$2"));
    }
    
}
