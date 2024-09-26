package Praktikum05;
import java.util.Scanner;
public class PemilihanBilangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka ;
        String hasil ;

        System.out.print(" Masukkan sebuah angka : ");
        angka = sc.nextInt();

        if ( angka % 2 == 0) {
            hasil = "termasuk bilangan genap" ;
        }
        else { 
            hasil = "termasuk bilangan ganjil" ;
        }

        System.out.print(" Angka " + hasil);
    }
}
