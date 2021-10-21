package people.model;

public class Student extends People {
    private double mediumScore;

    public Student() {
    }

    public Student(String name, int age, double mediumScore) {
        super(name, age);
        this.mediumScore = mediumScore;
    }

    public Student(int medium_score) {
        this.mediumScore = medium_score;
    }

    public Student(int id, String name, int age, int mediumScore) {
        super(id, name, age);
        this.mediumScore = mediumScore;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(int mediumScore) {
        this.mediumScore = mediumScore;
    }

    public int sort(Student student) {
        if (this.mediumScore > student.mediumScore) return 1;
        else if (this.mediumScore < student.mediumScore) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() + ", name='" + super.getName() + ", age=" + super.getAge() +
                ", medium_score=" + mediumScore +
                '}';
    }
}
