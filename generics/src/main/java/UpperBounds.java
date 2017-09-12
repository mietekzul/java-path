import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class UpperBounds {
    public static double sumList(List<? extends Number> list) {
        return list.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<>();
//        numbers.add(3);

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumList(ints));

        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(sumList(doubles));

        List<Double> doubles1 = DoubleStream.iterate(1.0, d -> d + 1.0)
                .limit(6)
                .mapToObj(Double::new)
                .collect(Collectors.toList());
        System.out.println(sumList(doubles1));
    }
}
