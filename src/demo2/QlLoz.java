package demo2;

public class QlLoz extends LOZto {
    private int height;
    private String name;

    public QlLoz(String color, int height, String name) {
        super(color);
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QlLoz() {
    }

    public QlLoz(String color, int height) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "QlLoz{" +
                " độ dài của lozzz =" + height +
                " màu  = "+ super.getColor()+" tên : "+getName()+
                '}';
    }


}
