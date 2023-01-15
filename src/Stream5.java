import java.util.stream.Stream;

public class Stream5 {
    public static void main(String[] args) {
        Stream.of(1,1,1,2,3,4,5,5,6,7,8,9,10,11,11,12,12,12,13,14,15,16,17,18)
                .skip(5)
                .distinct()
                .limit(10)
                .forEach(x -> System.out.println(x));
    }
}
