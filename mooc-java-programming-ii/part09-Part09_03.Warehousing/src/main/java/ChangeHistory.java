import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

   public String toString() {
        return String.valueOf(this.history);
   }

   public double maxValue() {
        if (isEmpty()) {
            return 0;
        }
        double largest = this.history.get(0);
        for (double number : this.history) {
            if (largest < number) {
                largest = number;
            }
        }
        return largest;
   }

   public double minValue() {
        if (isEmpty()) {
            return 0;
        }
        double smallest = this.history.get(0);
        for (double number : this.history) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
   }

   public double average() {
        if (isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double number : this.history) {
            sum += number;
        }
        return sum/this.history.size();
   }

   private boolean isEmpty() {
        if (this.history.size() == 0) {
            return true;
        }
        return false;
   }

}
