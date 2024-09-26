package Praktikum05;
import java.util.Scanner;
public class PemilihanUsia18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int umur;
        String hasil;

        System.out.print(" Masukkan umur anda : ");
        umur = sc.nextInt();

        if (umur <= 12 && umur >= 0) {
            hasil = "Anak";
       } else  if (umur <= 19 && umur >=13) {
            hasil = "Remaja";
       } else if (umur <= 64 && umur >=20) {
            hasil = "Dewasa";
       } else if (umur >=65) {
            hasil = "Lansia";
       }else {
            hasil = "Angka yg diinput invalid";
       }

       System.out.println("Menurut data " + umur + " tahun dikategorikan " + hasil);
    }
}
