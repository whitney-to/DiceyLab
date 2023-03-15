import java.util.Map;

public class Simulation {
    private int numberOfDices;
    private int numberOfTosses;
    Dice dice;

    public Simulation(int numberOfDices, int numberThrows) {
        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberThrows;
        dice = new Dice(numberOfDices);
    }

    public int getNumberOfDices() {
        return numberOfDices;
    }

    public int getNumberOfTosses() {
        return numberOfTosses;
    }


    public void runSimulation() {
        for(int i = 1; i <= numberOfTosses; i++){
            dice.tossAndSum();
        }
    }

    public void printResult() {
        System.out.format("***\n"
                +"Simulation of %d dice tossed for %d times.\n"
                +"***\n\n",numberOfDices,numberOfTosses);
        for(Map.Entry<Integer,Integer> tossResult
                : dice.getBin().getBinsMap().entrySet()){
            double percentage = (double)tossResult.getValue()/numberOfTosses;
            System.out.format("%2d : %7d: %.2f %s\n",
                    tossResult.getKey(),    // bin #
                    tossResult.getValue(),  // total number of times for a bin
                    percentage,             // percent landing on the bin
                    getAsterisk((int) (percentage*100)));   // asterisks based on percent
        }
    }

    public String getAsterisk(int num){
        StringBuilder asterisks = new StringBuilder("");
        for(int i = 0 ; i < num; i++){
            asterisks.append("*");
        }
        return asterisks.toString();
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1000000);
        sim.runSimulation();
        sim.printResult();
    }
}
