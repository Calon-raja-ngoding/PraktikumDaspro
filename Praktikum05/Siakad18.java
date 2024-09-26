package Praktikum05;
import java.util.Scanner;
public class Siakad18 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String nama, nim, kelas;
       byte absen;
       double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir;

       System.out.print("Masukkan nama:");
       nama = sc.nextLine();
       System.out.print("Masukkan NIM:");
       nim = sc.nextLine();
       System.out.print("Masukkan kelas:");
       kelas = sc.nextLine();
       System.out.print("Masukkan  no absen:");
       absen = sc.nextByte();

       System.out.print("Masukkan nilai kuis:");
       nilaiKuis = sc.nextDouble();
       System.out.print("Masukkan nilai tugas:");
       nilaiTugas = sc.nextDouble();
       System.out.print("Masukkan nilai UTS:");
       nilaiUTS = sc.nextDouble();

       nilaiAkhir = ( nilaiKuis + nilaiTugas + nilaiUTS) / 3;

       String nilaiHurus, kualifikasi;
       if (nilaiAkhir <= 100 && nilaiAkhir >80) {
            nilaiHurus = "A";
            kualifikasi = "Sangat Baik";
       } else  if (nilaiAkhir <= 80 && nilaiAkhir >73) {
            nilaiHurus = "B+";
            kualifikasi = "Lebih dari Baik";
       } else if (nilaiAkhir <= 73 && nilaiAkhir >65) {
            nilaiHurus = "B";
            kualifikasi = "Baik";
       } else if (nilaiAkhir <= 65 && nilaiAkhir >60) {
            nilaiHurus = "C+";
            kualifikasi = "Lebih dari Cukup";
       } else if (nilaiAkhir <= 60 && nilaiAkhir >50) {
            nilaiHurus = "C";
            kualifikasi = "Cukup";
       } else  if (nilaiAkhir <= 50 && nilaiAkhir >39) {
            nilaiHurus = "D";
            kualifikasi = "Kurang";
       } else if (nilaiAkhir <= 39 ) {
            nilaiHurus = "E";
            kualifikasi = "Gagal";
       }
       else {
            nilaiHurus = "Angka yg diinput invalid";
            kualifikasi = "Angka yg diinput invalid";
       }

       System.out.println("Mahasiswa dengan nama " + nama + " ( NIM " + nim + " ) " + " Kelas " + kelas + " Nomor absen " + absen);
       System.out.println("Nilai akhir: " + nilaiAkhir);
       System.out.println("Nilai akhir huruf : " + nilaiHurus );
       System.out.println("Kualifikasi : " + kualifikasi );

    }
}