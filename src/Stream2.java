import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        IntStream.of(11, 43, 22, 52, 39, 135, 34)
                .sorted()
                .forEach(x -> System.out.println(x));
        Stream.of(11, 43, 22, 52, 39, 135, 34)
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x));
    }
}
