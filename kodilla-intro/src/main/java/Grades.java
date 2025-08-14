public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void recentlyAdded() {
        if (this.size == 0) {
            System.out.println("No grades");
            return;
        }
        System.out.println(this.grades[this.size - 1]);
    }

    public double averageGrade() {

        if (this.size == 0) {
            System.out.println("No grades");
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }
        double average = sum;
        average = average / this.size;
        return average;
    }
}
