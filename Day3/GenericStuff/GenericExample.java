package GenericStuff;

public class GenericExample {

    public static void main(String[] args) {
        GenericPrint<Integer> intPrinter = new GenericPrint<Integer>(25);
        GenericPrint<String> strPrinter = new GenericPrint<String>("String 25");
        GenericPrint<Double> dblPrinter = new GenericPrint<Double>(25.00);

        intPrinter.print();
        strPrinter.print();
        dblPrinter.print();

    }
}