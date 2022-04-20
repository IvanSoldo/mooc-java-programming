import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = this.totalWeight();
        if (totalWeight + suitcase.totalWeight() > this.maximumWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }

    private int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        String allItems = "";

        for (Suitcase suitcase : suitcases) {

            for (Item item : suitcase.getItems()) {
                allItems = allItems + item.getName() + " (" + item.getWeight() + " kg)" + "\n";
            }
        }
        System.out.println("The suitcases in the hold contain the following items: " + "\n" + allItems);
    }

}
