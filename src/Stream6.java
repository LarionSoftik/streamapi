import java.util.Comparator;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {
        Stream.of(1,1,2,3,4,5,5,6,7,8,9,10,11,11)
                .skip(5)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x*10+5));
    }
}
