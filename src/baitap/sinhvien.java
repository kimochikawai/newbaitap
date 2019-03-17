package baitap;
import java.util.Scanner;
public class sinhvien {

 public String masv;
 public String name;
 public double diemTB;
 public int age;
 public String lop;
    public void inputInfo(){
        System.out.println("Nhap ten sinh vien : ");
        Scanner scanner=new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập mã sinh viên : ");
        masv=scanner.nextLine();
        System.out.println("Nhập điểm trung bình : ");
        diemTB=scanner.nextDouble();

    }
 public void ShowInfo(){
  System.out.println("Thông tin sinh viên : ");
  System.out.println(name+"  Tuổi : "+age);
  System.out.println("Mã SInh viên :  "+masv);
  System.out.println("Điểm trung bình : " + diemTB);
 }
 public void tinhhocbong(){

  if (diemTB>=8.0){
   System.out.println("Co Hoc Bong");
  }
  else
   System.out.println("Không có học bổng");
 }

}
