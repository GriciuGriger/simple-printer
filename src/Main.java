public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, 0, false);

        System.out.println("initial page count = "+printer1.getPagesPrinted());
        int pagesPrinted = printer1.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for printer = "+printer1.getPagesPrinted());
pagesPrinted = printer1.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for printer = "+printer1.getPagesPrinted());
    }
}
