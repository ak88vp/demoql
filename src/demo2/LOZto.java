package demo2;

public class LOZto {
    private String color;

    public LOZto(String color) {
        this.color = color;
    }

    public LOZto() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "LOZto{" +
                "color='" + color + '\'' +
                '}';
    }
}
