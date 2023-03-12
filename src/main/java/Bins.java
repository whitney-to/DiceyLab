import java.util.HashMap;
import java.util.Map;

public class Bins {
    private int lowest;
    private int highest;
    Map<Integer,Integer> binsMap;
    public Bins(int lowest, int highest) {
        this.lowest = lowest;
        this.highest = highest;
        this.binsMap = initializeBin();
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

    public Map<Integer, Integer> getBinsMap() {
        return binsMap;
    }

    public void setBinsMap(Map<Integer, Integer> binsMap) {
        this.binsMap = binsMap;
    }

    public HashMap<Integer,Integer> initializeBin(){
        HashMap<Integer,Integer> newBins = new HashMap<>();
        for(int i = this.lowest; i <= this.highest; i++){
            newBins.put(i,0);
        }
        return newBins;
    }

    public Integer getBin(int bin) {
        if(bin >= this.lowest && bin <= this.highest) {
            return binsMap.get(bin);
        }
        return -1;
    }

    public int incrementBin(int bin) {
        if(bin >= this.lowest && bin <= this.highest){
            binsMap.put(bin,binsMap.get(bin)+1);
            return binsMap.get(bin);
        } else {
            return -1;
        }
    }
}
