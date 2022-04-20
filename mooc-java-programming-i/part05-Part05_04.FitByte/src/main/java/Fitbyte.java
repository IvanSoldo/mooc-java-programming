public class Fitbyte {

    private int age;
    private int restingHearthRate;

    public Fitbyte (int age, int restingHearthRate) {
        this.age = age;
        this.restingHearthRate = restingHearthRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHearthRate) * (percentageOfMaximum) + this.restingHearthRate;
    }

}
