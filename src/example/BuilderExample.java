package example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 *
 * @author tadaki
 */
public class BuilderExample {

    public static <T> String list2String(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        list.stream().forEachOrdered(
                p -> sb.append(p).append(",")
        );
        int k = sb.lastIndexOf(",");
        sb.deleteCharAt(k).append("]");
        return sb.toString();
    }

    public static <T> String list2String2(List<T> list) {
        StringJoiner sj = new StringJoiner(",", "(", ")");
        list.stream().forEachOrdered(t -> sj.add(t.toString()));
        return sj.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (n * Math.random()));
        }
        System.out.println(list2String(list));
        System.out.println(list2String2(list));
    }

}
