public class Dice {
    private int numberOfDies;
    private int lowest;
    private int highest;
    private Bins bin;

    public Dice(int numberOfDies) {
        this.numberOfDies = numberOfDies;
        this.lowest = numberOfDies;
        this.highest = numberOfDies*6;
        this.bin = new Bins(lowest, highest);
    }

    public int getNumberOfDies() {
        return numberOfDies;
    }

    public void setNumberOfDies(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public int getLowest() {
        return lowest;
    }

    public void setLowest(int lowest) {
        this.lowest = lowest;
    }

    public int getHighest() {
        return highest;
    }

    public void setHighest(int highest) {
        this.highest = highest;
    }

    public Bins getBin() {
        return bin;
    }

    public void setBin(Bins bin) {
        this.bin = bin;
    }

    public Integer tossAndSum() {
        int sum = 0;
        for(int i = 1; i <= numberOfDies; i++){
            sum += (Math.random()*6) + 1;
        }
        bin.incrementBin(sum);
        return sum;
    }


}
