package baiphanso;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        phanso phanso = new phanso();
        Scanner nhap = new Scanner(System.in);
        int luachon = 0;
        int n = 0;
        int count = 0;

        phanso.showMenu();

        do {
            System.out.println("Nhap luachon : ");
            luachon = Integer.parseInt(nhap.nextLine());
            switch (luachon) {
                case 1:
                    phanso.nhap();
                    break;

                case 2:
                    phanso.in();
                    break;
                case 3:
                    phanso.rutgon();
                    break;
                case 4:
                    phanso.nghichdao();
                    break;
                case 5:
                    System.out.println("Thoat !!!!");
                    break;

                default:
                    System.out.println("Nhap lai!!!");
                    break;
            }
        }
        while (luachon != 5);


    }

//        static void showMenu() {
//            System.out.println("1. Nhap phan so");
//            System.out.println("2. In phan so");
//            System.out.println("3. Rut gon phan so");
//            System.out.println("4. Nghich dao phan so");
//            System.out.println("5. Thoat!!");
//        }
}
