public class Lambda3 {
    public static void main(String[] args) {
        Math math1 = (int a, int b) -> a + b;
        Math math2 = (int a, int b) -> a - b;
        Math math3 = (int a, int b) -> a * b;
        Math math4 = (int a, int b) -> a / b;

        System.out.println(math1.abc(6,5));
        System.out.println(math2.abc(6,5));
        System.out.println(math3.abc(6,5));
        System.out.println(math4.abc(6,5));



    }
}
interface Math{
    int abc (int a, int b);
}
