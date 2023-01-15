import java.text.Collator;
import java.util.stream.IntStream;

public class Stream1 {
    public static void main(String[] args) {
        System.out.println(IntStream.of(11, 43, 22, 52, 39, 135, 34)
                .filter(x -> x % 2 == 0)
                .count());
        // я чисто даун, так как иначе никак вывести недопетрил)

    }
}
