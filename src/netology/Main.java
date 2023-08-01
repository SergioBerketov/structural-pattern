package netology;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        IntsCalculator intsCalculator = new IntsCalculator(calculator);
        System.out.println(intsCalculator.sum(10, 5));
    }
}