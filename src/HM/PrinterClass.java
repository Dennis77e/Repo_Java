package HM;

public class PrinterClass {
    public static void main(String[] args) {


        Printer printer = new Printer();
        printer.printSummary();

        int countOfPages = 9;
        int extraToner = 10;
        int extraPages = 0;


        printer.addToner(extraToner);
        printer.printSummary();

        printer.printSingle(countOfPages);
        printer.printSummary();

        printer.printDouble(countOfPages);
        printer.printSummary();

    }

}



