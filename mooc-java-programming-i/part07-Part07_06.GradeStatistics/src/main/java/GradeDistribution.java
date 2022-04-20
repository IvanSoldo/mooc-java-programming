import java.util.ArrayList;

public class GradeDistribution {

    private int failed;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;

    public GradeDistribution() {
        this.failed = 0;
        this.one = 0;
        this.two = 0;
        this.three = 0;
        this.four = 0;
        this.five = 0;
    }

    private void distributeGrades(ArrayList<Integer> points) {
        for (int point : points) {

            if (point < 50) {
                this.failed ++;
            } else if (point < 60) {
                this.one ++;
            } else if (point < 70) {
                this.two ++;
            } else if (point < 80) {
                this.three ++;
            } else if (point < 90) {
                this.four ++;
            } else {
                this.five ++;
            }
        }
    }

    private String printStars(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i ++) {
            stars = stars + "*";
        }
        return stars;
    }

    public void getGrades(ArrayList<Integer> points) {

        this.distributeGrades(points);

        System.out.println("Grade distribution:");
        System.out.println("5: " + this.printStars(this.five));
        System.out.println("4: " + this.printStars(this.four));
        System.out.println("3: " + this.printStars(this.three));
        System.out.println("2: " + this.printStars(this.two));
        System.out.println("1: " + this.printStars(this.one));
        System.out.println("0: " + this.printStars(this.failed));
    }

}
