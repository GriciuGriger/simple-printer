public class Printer {
    private int tonerLevel;

    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        } else {
         this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount <=100){
            if(this.tonerLevel +tonerAmount>100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint /=2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    /*  public void fillUpTheToner(int addedToner){
          this.tonerLevel = this.tonerLevel + addedToner;
          System.out.println("Actual amount of toner:" + tonerLevel);

      } */

  /*  public void printSomePages(){
        if(this.tonerLevel<this.pagesPrinted *5) {
            this.tonerLevel = this.tonerLevel - this.pagesPrinted * 5;
            System.out.println("Number of pages printed: " + this.pagesPrinted);
            System.out.println("Remaining amount of toner: " + this.tonerLevel);
        } else {
            System.out.println("Not enough toner! Fill it up, please!");
        }
    } */

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
