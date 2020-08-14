package chapter09.degin_pattern.strategy;

public class Ramada {
    public static void main(String[] args) {
        Validator numericValidator = new Validator((s) -> s.matches("[a-z]+"));
        boolean b1 = numericValidator.validate("aaaaaa");
        Validator lowerCaseValidator = new Validator((s) -> s.matches("\\d+"));
        boolean b2 = lowerCaseValidator.validate("bbbbbbbb");
        System.out.println(b1);
        System.out.println(b2);

    }
}
