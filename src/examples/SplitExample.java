package example;

/**
 *
 * @author tadaki
 */
public class SplitExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input[] = {
            "a,b,c,d,e,f",
            "a b c d e f",
            "a\tb\tc\td\te\tf",
            "a:b:c:d:e:f"
        };
        for (String s : input) {
            String ss[] = s.split("\\s|,|:");
            for (String e : ss) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }

}
