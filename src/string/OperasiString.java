package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Banjarbaru";

        System.out.println(kota);

        char[] mahasiswaChar = { 'M','A','H','A','S','I','S','W','A' };
        String mahasiswaString  = new String(mahasiswaChar);
        System.out.println(mahasiswaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));

    }
}
