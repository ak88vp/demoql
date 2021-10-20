package DemoQuanLyNV.QuanLy;

import DemoQuanLyNV.NhanVien.NhanVien;

public interface quanLy <T> {
    void them(T t);
    void in();
    int tim(int id);
    void sua(int id,T t);
    void xoa(int id);
    void sapXep();

}
