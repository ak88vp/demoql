package people.model;

public class Teacher  extends People{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", subject='" + subject + '\'' +
                '}';

    }
}
