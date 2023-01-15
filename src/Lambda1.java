public class Lambda1 {

    public static void main(String[] args) {
        Expression expression;
        expression = n -> System.out.println(n);
        expression.abc("Hellova");


    }
}interface Expression{
    void abc (String n);
}
