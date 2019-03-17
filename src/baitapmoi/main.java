package baitapmoi;

public class main {
    public static void main(String[] args) {
        songuyento soNguyenTo = new songuyento(4);
        for (int i = 0; i < 20; i++) {
            System.out.println("SNT tiếp " + soNguyenTo.timSoNguyenToTiepTheo());
        }
    }

}
