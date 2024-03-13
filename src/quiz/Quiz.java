package quiz;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

/**
 *
 * @author tadaki
 */
public class Quiz {

    public static double sumAll(List<Double> input, DoubleFunction<Double> function) {
        double sum = 0.;
        for (Double v : input) {
            sum += function.apply(v);
        }
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double d[] = {1., 2., 3.};
        DoubleFunction f = x -> x;
        double r = sumAll(Arrays.asList(d), f);
        System.out.println(r);
    }

}
