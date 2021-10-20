package demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        QlLoz[] qlLoz = new QlLoz[3];
        qlLoz[0]=new QlLoz("red",10,"uy");
        qlLoz[1]=new QlLoz("blue",5,"huy");
        qlLoz[2]=new QlLoz("blue",1,"ak88");
        QUANly quaNly=new QUANly();
        quaNly.them(qlLoz[0]);
        quaNly.them(qlLoz[1]);
        quaNly.them(qlLoz[2]);
        quaNly.xoa("uy");
        quaNly.xoa("huy");
        quaNly.xoa("ak88");
        quaNly.in();




    }
}
