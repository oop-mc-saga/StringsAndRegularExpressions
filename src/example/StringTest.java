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
        c = c+"c";
        if(a==b){System.out.println("a と bは同じオブジェクト");}
        if(a==c){System.out.println("a と cは同じオブジェクト");}
        if(c!=d){System.out.println("c と dは異なるオブジェクト");}
        if(a.equals(b)){System.out.println("a と bは同じ文字列");}
        if(a.equals(c)){System.out.println("a と cは同じ文字列");}
    }
    
}
