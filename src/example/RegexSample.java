package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tadaki
 */
public class RegexSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "0010111010011";
        //正規表現の定義
        Pattern p = Pattern.compile("101+");
        Matcher m = p.matcher(input);
        int c = 0;//探索開始位置
        while (m.find(c)) {//位置を指定して探索
            c = m.start();//パターンを発見した位置
            String s = m.group();
            System.out.println("matches "+s + " at " + c);
            c++;//探索位置を一つ進める
        }
    }

}
