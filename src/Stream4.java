import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        Stream.of(11, 43, 22, 52, 39, 135, 34)
                .sorted()
                .filter(x -> x>20)
                .forEach(x -> System.out.println(x*10));
    }
}
