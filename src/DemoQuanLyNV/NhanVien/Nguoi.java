package DemoQuanLyNV.NhanVien;

public abstract class Nguoi {
    private String name;
    private int age;

    public Nguoi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Nguoi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
