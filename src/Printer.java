public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if(tonerLevel>0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillUpTheToner(int addedToner){
        this.tonerLevel = this.tonerLevel + addedToner;
        System.out.println("Actual amount of toner:" + tonerLevel);
    }

    public void printSomePages(){
        if(this.tonerLevel<this.numberOfPagesPrinted*5) {
            this.tonerLevel = this.tonerLevel - this.numberOfPagesPrinted * 5;
            System.out.println("Number of pages printed: " + this.numberOfPagesPrinted);
            System.out.println("Remaining amount of toner: " + this.tonerLevel);
        } else {
            System.out.println("Not enough toner! Fill it up, please!");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
