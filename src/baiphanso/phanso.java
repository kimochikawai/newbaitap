package baiphanso;
import java.util.Scanner;
public class phanso{
    int tuso;
    int mauso;
    Scanner scan = new Scanner(System.in);

    public phanso() {
    }

    public phanso(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public void nhap() {
        System.out.println("Nhap tu: ");
        tuso = Integer.parseInt(scan.nextLine());

        System.out.println("Nhap mau: ");
        mauso = Integer.parseInt(scan.nextLine());
    }

    public void in() {
        System.out.println("In phan so: ");
        System.out.println(tuso + "/" + mauso);
    }

    public void rutgon() {
        int i = timUSCLN(tuso, mauso);
        int rutgontu, rutgonmau;
        rutgontu = tuso/ i;
        rutgonmau = mauso/ i;

        System.out.println("Phan so rut gon la: ");
        System.out.println(rutgontu + "/" + rutgonmau);
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void nghichdao(){
        int nghichdaotu;
        int nghichdaomau;

        nghichdaotu = mauso;
        nghichdaomau = tuso;

        System.out.println("Nghich dao la: ");
        System.out.println(nghichdaotu + "/" + nghichdaomau);
    }
    public void showMenu(){
        System.out.println("1. Nhap phan so");
        System.out.println("2. In phan so");
        System.out.println("3. Rut gon phan so");
        System.out.println("4. Nghich dao phan so");
        System.out.println("5. Thoat!!");
    }

}