package nhanvien;

import java.util.Scanner;

public class nhanvien {
    public String name;
    public int age;
    public String address;
    public double salary;
    public int workingTime;
    public nhanvien(){
        this.inputInfo();
        System.out.println("tien thuong nhan vien : " );
    }

    public nhanvien(String name , int age , String address, double salary, int workingTime){
        name = name ;
        age = age;
        address= address;
        salary= salary;
        workingTime=workingTime;
    }
    public nhanvien(String abc , int x ){
        System.out.println(abc);
    }
    public nhanvien(int x , String abc){
        System.out.println("Hello 32");
    }
    public void inputInfo(){
        System.out.println("Nhap ten sinh vien : ");
        Scanner scanner=new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên : ");
        address=scanner.nextLine();
        System.out.println("Nhập Lương : ");
        salary=scanner.nextDouble();
        System.out.println("Nhap thời gian làm");
        workingTime=scanner.nextInt();

    }

}
