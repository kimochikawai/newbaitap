package assigtment;

        import java.util.Scanner;
public class Fraction {
    public int Tuso;
    public int Mauso;

    public Fraction() {
    }

    public Fraction(int tuso, int mauso) {
        this.Tuso=tuso;
        this.Mauso=mauso;
    }
    public int getTuso(){
        return Tuso;
    }
    public int getMauso(){
        return Mauso;
    }
    public void setTuso(int tuso){
        this.Tuso=tuso;
    }
    public void setMauso(int mauso){
        this.Mauso=mauso;
    }
    public void nhapPhanSo(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap tu so");
        this.setTuso(nhap.hasNextInt()?nhap.nextInt():1);
        System.out.println("Nhap mau so");
        this.setMauso(nhap.hasNextInt()?nhap.nextInt():1);
    }
    public void inPhanSo(){
        System.out.println("Phan so "+this.getTuso()+"/" +this.getMauso());
    }
    public void rutgonphanso(){
        int usc =this.UCLN();{
            this.setTuso(this.getTuso()/usc);
            this.setMauso(this.getMauso()/usc);
            System.out.println("Phan so rut gon la : " +this.getTuso()+"/"+this.getMauso());
        }
    }
    public int UCLN(){
        int usc=1;
        int abs_tuso=Math.abs(this.getTuso());
        int abs_mauso=Math.abs(this.getMauso());
        for (int i=2;i<=Math.min(abs_tuso,abs_mauso);i++){
            if (abs_tuso%i==0&&abs_mauso%i==0){
                usc=i;
            }
        }
        return usc;
    }
    public void nghichdao(){
        if(this.getTuso()==0){
            System.out.println("khong the nghich dao vi tu so = 0");
            return;
        }
        int tmp=this.getMauso();
        this.setMauso(this.getTuso());
        this.setTuso(tmp);
    }
    public void add(Fraction fraction){
        this.rutgonphanso();
        fraction.rutgonphanso();
         int tu_so=this.getTuso()*fraction.getMauso()+this.getMauso()*fraction.getTuso();
        int mau_so=this.getMauso()*fraction.getMauso();
        Fraction result=new Fraction( tu_so,mau_so );
        result.rutgonphanso();
        System.out.println("Tong hai phan so : "+result.getTuso()+"/"+result.getMauso() );
    }
    public void sub(Fraction fraction){
        this.rutgonphanso();
        fraction.rutgonphanso();
        int tu_so=this.getTuso()*fraction.getMauso()-this.getMauso()*fraction.getTuso();
        int mau_so=this.getMauso()*fraction.getMauso();
        Fraction result=new Fraction( tu_so,mau_so );
        result.rutgonphanso();
        System.out.println("Hieu hai phan so : "+result.getTuso()+"/"+result.getMauso() );
    }
    public void mul(Fraction fraction){
        int tu_so=this.getTuso()*fraction.getTuso();
        int mau_so=this.getMauso()*fraction.getMauso();
        System.out.println("Tich hai phan so =" +tu_so+"/"+mau_so);
    }
    public void div(Fraction fraction){
        int tu_so=this.getTuso()*fraction.getMauso();
        int mau_so=this.getMauso()*fraction.getTuso();
        System.out.println("Thuong hai phan so =" +mau_so+"/"+tu_so);
    }


}
