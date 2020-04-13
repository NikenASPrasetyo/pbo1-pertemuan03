package percabangan;

public class PercabanganIFELSE {
    public static void main(String[] args) {
        double belanja = 50000;
        double dompet = 60000;

        if(dompet<belanja) {
            System.out.println("Biaya masih kurang, lain kali ya!");
        }else{
            System.out.println("Yeay! Uang cukup! Selamat berbelanja");
        }
    }
}
