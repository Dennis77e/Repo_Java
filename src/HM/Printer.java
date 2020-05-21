package HM;

public class Printer {
    int toner;
    int pages;

    public Printer() {
        toner = 100;
        pages = 100;
    }

    public void addToner(int toner) {
        this.toner += toner;
        System.out.println("Added " + toner + " toner");
    }

    public void addPages(int pages) {
        this.pages += pages;
        System.out.println("Added " + pages + " pages");
    }

    public void printSingle(int countOfPages) {
        toner -= countOfPages;
        pages -= countOfPages;
        System.out.println("Printed " + countOfPages + " page(s)");
    }

    public void printDouble(int countOfPages) {
        toner -= countOfPages;
        if(countOfPages % 2 == 0) {
            pages -= countOfPages / 2;
        }else {
            pages -= countOfPages / 2 + 0.5;
        }
        System.out.println("Printed " + countOfPages + " page(s)");
    }

    public void printSummary () {
        System.out.println("Toner level - " + toner);
        System.out.println("Pages count - " + pages);
    }

}
