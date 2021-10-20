package DemoQuanLyNV.QuanLy;

import DemoQuanLyNV.NhanVien.NhanVien;

import java.util.Arrays;

public class QuanLyNhanVien extends NhanVien implements quanLy<NhanVien> {
    private NhanVien[] list =new NhanVien[3];
    private int size = 0;

    @Override
    public void them(NhanVien nhanVien) {
        list[size]=nhanVien;
        size++;
    }

    @Override
    public void in() {
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
        System.out.println("--------------------------");
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

    public NhanVien[] getList() {
        return list;
    }

    public void setList(NhanVien[] list) {
        this.list = list;
    }

    @Override
    public void xoa(int id) {
        NhanVien[]  newnv= new NhanVien[list.length-1];
        int index=0;
        for (int i=0; i< list.length;i++){
            if(id==list[i].getId()){
                continue;
            }
            newnv[index]=list[i] ;
            index++;
        }
        setList(newnv);

    }

    @Override
    public void sapXep() {
        Arrays.sort(list);
    }


}
class Main{
    public static void main(String[] args) {
        QuanLyNhanVien ql=new QuanLyNhanVien();
        NhanVien nv1=new NhanVien("ak88",16,888,1102);
        NhanVien nv2=new NhanVien("ak66",10,666,2403);
        ql.them(nv1);
        ql.them(nv2);
        ql.in();
        ql.sapXep();
        ql.in();




    }
}
