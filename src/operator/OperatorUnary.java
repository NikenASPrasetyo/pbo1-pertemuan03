package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 5;
        i++;                        //i tadinya 5 ditambah 1 sehinga i=6
        System.out.println(i);      //hasilnya
        i++;                        //sebelumnya i bernilai 6 ditambah 1 lagi menjadi 7
        System.out.println(i);      //hasilnya
        i=i+1;                      //i++ sama dengan i=i+1
        System.out.println(i);      //hasilnya menjadi 8

        //Berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=4;       //sama dengan i = i + 3
        System.out.println(i);

        i+=4;
        System.out.println(i);

        i*=4;       //sama dengan i = i * 4
        System.out.println(i);

        i*=4;
        System.out.println(i);
    }
}
