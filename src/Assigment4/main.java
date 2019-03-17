package Assigment4;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<SanPham> listSanPham=new ArrayList<SanPham>();
        SanPham sanPham1=new SanPham("052366","Ao gucci",1230000,5);
        SanPham sanPham2=new SanPham("035366","giay Balenciaga",15000000,2);
        SanPham sanPham3=new SanPham("035358","giay Gucci",3500000,0);
        sanPham2.giamgia();
        sanPham1.themSPvaodon(sanPham1);
        sanPham2.themSPvaodon(sanPham2);
        sanPham3.themSPvaodon(sanPham3);
        listSanPham.add(sanPham1);
        listSanPham.add(sanPham2);
        listSanPham.add(sanPham3);



    }
}
