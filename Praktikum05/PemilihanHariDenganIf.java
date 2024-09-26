package Praktikum05;
import java.util.Scanner;
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka ;
        String hasil;

        System.out.print(" Masukkan sebuah angka :");
        angka = sc.nextInt();

        if (angka == 1) {
            hasil = "weekday";
        } else {
            if (angka == 2) {
                hasil = "weekday";
            } else {
                if (angka == 3) {
                    hasil = "weekday";
                } else {
                    if (angka == 4) {
                        hasil = "weekday";
                    } else {
                        if (angka == 5) {
                            hasil = "weekday";
                        } else {
                            if (angka == 6) {
                                hasil = "weekend";
                            } else {
                                if (angka == 7) {
                                    hasil = "weekend";
                                } else {
                                    hasil = "invalid number";
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print(angka + " Termasuk " + hasil);
    }
}
