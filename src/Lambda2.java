public class Lambda2 {
    public static void main(String[] args) {
        Search lalala = n -> {
            if (n % 2 == 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
            return n;
        };
        int n = lalala.abc(7);
    }
}

interface Search {
    int abc (int z);
}
