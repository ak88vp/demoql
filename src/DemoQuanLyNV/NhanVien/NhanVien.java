package DemoQuanLyNV.NhanVien;

import DemoQuanLyNV.QuanLy.quanLy;

public  class NhanVien extends Nguoi implements Comparable<NhanVien>{
    private int money;
    private int id;

    public NhanVien() {
    }

    public NhanVien(int money) {
        this.money = money;
    }

    public NhanVien(String name, int age, int money, int id) {
        super(name, age);
        this.money = money;
        this.id = id;
    }

    public NhanVien(int money, int id) {
        this.money = money;
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "NhanVien{" +
                " money =" + money +
                ", id= " + id +" name :" +getName()+" age : "+getAge()+
                '}';
    }


    @Override
    public int compareTo(NhanVien o) {
        return money-o.getMoney();
    }
}
