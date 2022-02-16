package example;

/**
 *
 * @author tadaki
 */
public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "ab";
        String d = "ab";
        c = c + "c";
        if (a == b) {
            System.out.println("a is the same object of b");
        }
        if (a == c) {
            System.out.println("a is the same object of c");
        }
        if (c != d) {
            System.out.println("d is not the same object of c");
        }
        if (a.equals(b)) {
            System.out.println("a is the same string of b");
        }
        if (a.equals(c)) {
            System.out.println("a is the same string of c");
        }
    }

}
