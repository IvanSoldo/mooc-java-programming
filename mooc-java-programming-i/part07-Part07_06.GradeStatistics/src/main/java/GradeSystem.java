import java.util.ArrayList;

public class GradeSystem {

    private ArrayList<Integer> points;
    private GradeDistribution gradeDistribution;

    public GradeSystem() {
        this.points  = new ArrayList<>();
        this.gradeDistribution = new GradeDistribution();
    }

    public void add(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }

    public double average() {
        int sum = 0;

        for (int point : this.points) {
            sum += point;
        }
        return 1.0 * sum / this.points.size();
    }

    public double averageOfPassingGrade() {
        int sum = 0;
        int count = 0;

        for (int point : this.points) {
            if (point >= 50) {
                sum += point;
                count ++;
            }
        }
        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int count = 0;

        for (int point : this.points) {
            if (point >= 50) {
                count++;
            }
        }
        return 100.00 * count / this.points.size();
    }

    public void print() {
        System.out.println("Point average (all): " + this.average());
        System.out.println("Point average (passing): " + this.averageOfPassingGrade());
        System.out.println("Pass percentage: " + this.passPercentage());
        this.gradeDistribution.getGrades(this.points);
    }

}
