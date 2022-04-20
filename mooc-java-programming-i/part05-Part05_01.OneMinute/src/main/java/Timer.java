public class Timer {

    private int seconds;
    private int hundredths;
    private int secondsLimit;
    private int hundredthsLimit;

    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
        this.secondsLimit = 60;
        this.hundredthsLimit = 100;
    }

    public String toString() {
        if (this.seconds < 10 && this.hundredths < 10) {
            return "0" + this.seconds + ":0" + this.hundredths;
        } else if (this.seconds < 10) {
            return "0" + this.seconds + this.hundredths;
        } else if (this.hundredths < 10) {
            return this.seconds + ":0" + this.hundredths;
        }
        return this.seconds + ":" + this.hundredths;
    }

    public void advance() {
        this.hundredths +=1;

        if (this.hundredths >= this.hundredthsLimit) {
            this.hundredths = 0;
            this.seconds ++;

            if (this.seconds >= this.secondsLimit) {
                this.seconds = 0;
            }

        }
    }

}
