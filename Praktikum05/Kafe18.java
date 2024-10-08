package Praktikum05;
import java.util.Scanner;
public class Kafe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu ;
        char ukuranCup ;
        boolean keanggotaan ;
        int jumlah;

        System.out.print(" Masukkan menu : ");
        menu = sc.nextLine();
        System.out.print(" Masukkan ukuran cup : ");
        ukuranCup = sc.next().charAt(0);
        System.out.print(" Masukkan jumlah : ");
        jumlah = sc.nextInt();
        System.out.print(" Masukkan keanggotaan (True/False) : ");  
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0 ;

        switch (menu.toLowerCase()) {
            case "teh": 
                hargaMenu = 7000 ;     
                break;
            case "kopi":
                hargaMenu = 12000 ;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            }

            double totalHarga = jumlah * hargaMenu ;
            
            switch (ukuranCup) {
                case 'S':
                    break;
                case 'M':
                    totalHarga += 0.25 * totalHarga;
                    break;
                case 'L':
                    totalHarga += 0.4 * totalHarga;
                    break;
                default:
                    System.out.println("Ukuran yg anda pilih tidak tersedia");
            }
            double diskon = keanggotaan ? 0.1 : 0 ;
            double nominalBayar = totalHarga - ( diskon * totalHarga);

            System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
            System.out.println("Nominal bayar : Rp." + nominalBayar);
        
    }}
