package Praktikum05;
import java.util.Scanner;
public class PemilihanBilangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka ;

        System.out.print(" Masukkan sebuah angka : ");
        angka = sc.nextInt();

        if ( angka % 2 == 0) {
            System.out.print(" Angka " + angka + " termasuk bilangan genap");
        }
        else { 
            System.out.print(" Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}
