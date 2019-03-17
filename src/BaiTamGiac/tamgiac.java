package BaiTamGiac;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class tamgiac {
    public int a,b,c;

    public tamgiac(int a, int b, int c) {
        do {
            Scanner nhap=new Scanner(System.in);
            System.out.println("Nhập cạnh a : ");
            a=nhap.nextInt();
            System.out.println("Nhập cạnh b : ");
            b=nhap.nextInt();
            System.out.println("Nhập cạnh c : ");
            c=nhap.nextInt();
        }while (a<=0||b<=0||c<=0);
        this.a=a;
        this.b=b;
        this.c=c;


    }
    public boolean kiemtra(){
        if (a<=0||b<=0||c<=0){
            return false;
        }
        if (a+b<=c||a+c<=b||b+c<=a){
            return false;
        }
        else
            return true;
    }

    public  void dienTichTamGiac() {
       if (kiemtra()==true){
           float p = (float) (a + b + c) / 2;
           float s;
           s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
           System.out.println("diện tích tam giác : "+s);
       }
        else {
           System.out.println("ko thể tính diện tích");
       }

    }
    public void chuvitamgiac(){
      if (kiemtra()==true){
          float cv=a+b+c;
          System.out.println("chu vi tam giác :" +cv);

      }
      else {
          System.out.println("không thể tính chu vi ");
      }

    }
}


