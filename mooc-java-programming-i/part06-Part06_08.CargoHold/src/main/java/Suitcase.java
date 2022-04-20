import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        int totalWeight = this.totalWeight();

        if (totalWeight + item.getWeight() > maximumWeight) {
            return;
        }

        this.items.add(item);
    }

    public int totalWeight(){
        int weight = 0;

        for (Item item : this.items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + "kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }

    public void printItems() {

        String itemList = "";

        for (Item item : this.items) {
            itemList = itemList + item.toString() + "\n";
        }

        System.out.println("The suitcase contains the following items: " + "\n" + itemList);
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

}
