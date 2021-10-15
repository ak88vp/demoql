package DemoQuanLyNV.QuanLy;

import DemoQuanLyNV.NhanVien.NhanVien;

public class QuanLyNhanVien implements quanLy<NhanVien> {
    private NhanVien[] list =new NhanVien[2];
    private int size = 0;

    @Override
    public void them(NhanVien nhanVien) {
        list[size]=nhanVien;


    }

    @Override
    public void in() {
        for (int i=0;i<size;i++){
            System.out.println(list[i]);
        }

    }

    @Override
    public int tim(int id) {
        for (int i=0;i<size;i++){
            if(id==list[i].getId()){
                return i;

            }
        }
        return -99;
    }

    @Override
    public void sua(int id, NhanVien nhanVien) {
        list[tim(id)]=nhanVien;

    }

    @Override
    public void xoa(int id) {
        list[tim(id)]=null;
        size--;
    }
}
class Main{
    public static void main(String[] args) {
        QuanLyNhanVien ql=new QuanLyNhanVien();
        NhanVien nv1=new NhanVien("ak88",16,888,1102);
        NhanVien nv2=new NhanVien("ak66",18,666,2403);
        ql.them(nv1);
        ql.them(nv2);
        System.out.println(ql.tim(110));
        NhanVien nv3=new NhanVien("ak11",10,111,1111);
        ql.sua(2403,nv3);
        ql.xoa(1102);
        ql.in();

    }
}
