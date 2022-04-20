public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public void addObservation() {
        this.observation ++;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservation() {
        return this.observation;
    }

    public String toString() {
        return this.getName() + " (" + this.getLatinName() + "): " + this.getObservation() + " observations";
    }

}
