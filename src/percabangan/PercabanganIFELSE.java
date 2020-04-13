package percabangan;

public class PercabanganIFELSE {
    public static void main(String[] args) {
        double belanja = 80000;
        double dompet = 85000;

        if(dompet<belanja) {
            System.out.println("Biaya masih kurang, lain kali ya!");
        }else if (dompet>belanja) {
            double kembalian = dompet-belanja;
            System.out.println("Alhamdulillah, uang cukup plus ada kembaliannya : " + kembalian);
        }else{
            System.out.println("Yeay! Uangnya cukup!");
        }
    }
}
