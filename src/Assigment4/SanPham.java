package Assigment4;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;

public class SanPham {
    public String Id;
    public String tensanpham;
    public int giatien;
    public int number;

    public SanPham() {
    }
    public  SanPham(String id, String tensanpham, int giatien, int number)
    {
        Id = id;
        this.tensanpham = tensanpham;
        this.giatien = giatien;
        this.number = number;
    }
     public String getId(){
        return Id;
    }
    public String getTensanpham(){
        return tensanpham;
    }
    public int getGiatien(){
        return giatien;
    }
    public int getNumber(){
        return number;
    }
    public boolean kiemtra(){
       if (number>0){ return true;}
       else {
           return false;
       }
    }
    public double tiendonhang;
    public int x=0;
    public void Tongtien(){



    }

    public void themSPvaodon(SanPham sanPham){

        if(sanPham.kiemtra()==true){

            System.out.println("ID sản phẩm : "+getId());
            System.out.println("Tiền sản phẩm : "+getGiatien());

        }
        else {
            System.out.println("ID sản phẩm : "+getId());
            System.out.println("Hết hàng");
        }

    }

 public  int giamgia(){

        return getGiatien()*(4/5);
 }

}
