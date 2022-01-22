package com.binus_program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String nama, tglLahir, noHP, tanggal, bulan, tahun;
    static String alamat = "-", status = "-", NIK = "-";
    static int intBln;
    static String[] blnNama = {"Januari","Februari","Maret","April","Mei","Juni","Juli",
            "Agustus","September","Oktober","November","Desember"};

    public static void main(String[] args) {
        System.out.println("\n======== S E L A M A T  D A T A N G ========");
        System.out.println("-------- Lengkapi Data Diri Berikut --------\n");

        entri();

    }

    public static void entri() {
        Cek ck = new Cek(); //mendeklarasikan cara pemanggilan class Cek dengan keyword ck

//        input.nextLine(); //Mengatasi Scanner melewatkan .nextLine()
        System.out.print("Nama : ");
        nama = input.nextLine();

        try {
            System.out.print("Tanggal Lahir (dd-mm-yyyy): ");
            tglLahir = input.nextLine();

            if (ck.TglValid(tglLahir)) {
                tanggal = tglLahir.substring(0,2);
                bulan = tglLahir.substring(3,5);
                tahun = tglLahir.substring(6);
                intBln = (Integer.parseInt(bulan))-1;
            }
            else {
                System.out.println("\nFormat tanggal yang dimasukkan salah!\n");
                System.out.println("Silahkan masukkan kembali data Anda!");
                entri();
            }
        } catch (Exception e) {
            System.out.println("Masukkan data yang benar!");
        }

        System.out.print("Nomor Handphone : ");
        noHP = input.nextLine();

        validasi();

    }

    public static void validasi() {
        char jawab;

        System.out.println("\n--------------------------------------------\n");
        System.out.println("Silahkan cek kembali data berikut!");
        System.out.println("Nama : " + nama);
        System.out.println(String.format("Tanggal Lahir : %s %s %s ",tanggal,blnNama[intBln],tahun));
        System.out.println("Nomor Handphone : " + noHP);

//        try {
        do {
            System.out.println("\nApakah Anda yakin dengan data tersebut? [Y|N]");
            jawab = input.next().charAt(0);

            if (jawab == 'Y' || jawab == 'y') {
                menu();
            }
            else if (jawab == 'N' || jawab == 'n') {
                revisi();
            }
            else {
                System.out.println("Masukkan pilihan yang benar!");;
            }
        } while (jawab != 'Y' || jawab != 'y' || jawab != 'N' || jawab != 'n');
//        } catch (Exception e) {
        System.out.println("Masukkan pilihan yang benar!");
//        }
    }

    public static void revisi() {
        Cek ck = new Cek(); //mendeklarasikan cara pemanggilan class Cek dengan keyword ck

        System.out.println("Silahkan masukkan data yang benar!");
        input.nextLine(); //Mengatasi Scanner melewatkan .nextLine()
        System.out.print("Nama : ");
        nama = input.nextLine();

        try {
            System.out.print("Tanggal Lahir (dd-mm-yyyy): ");
            tglLahir = input.nextLine();

            if (Cek.TglValid(tglLahir)) {
                tanggal = tglLahir.substring(0,2);
                bulan = tglLahir.substring(3,5);
                tahun = tglLahir.substring(6);
                intBln = (Integer.parseInt(bulan))-1;
            }
            else {
                System.out.println("\nFormat tanggal yang dimasukkan salah!\n");
                revisi();
            }
        } catch (Exception e) {
            System.out.println("Masukkan data yang benar!");
        }

        System.out.print("Nomor Handphone : ");
        noHP = input.nextLine();

        validasi();

    }

    public static void menu() {
        String mainMenu;

        System.out.println("\n--------------------------------------------\n");
        System.out.println("========== Selamat Datang di MENU ==========");
        System.out.println("\n1. Lihat Data Diri");
        System.out.println("2. Update Data Diri");
        System.out.println("3. Keluar");

        try {
            System.out.print("\nSilahkan pilih Menu di atas: ");
            mainMenu = input.next();

            switch (mainMenu) {
                case "1" : showData();break;
                case "2" : updateData();break;
                case "3" : keluar();break;
                default : System.out.println("Menu yang Anda pilih tidak tersedia!");menu();
            }
        } catch (Exception e) {
            System.out.println("Masukkan pilihan yang benar!");
        }
    }

    public static void showData() {
        System.out.println("\n--------------------------------------------\n");
        System.out.println("   **     Berikut Data Diri Anda:     **   ");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Nomor Handphone : " + noHP);
        System.out.println(String.format("Tanggal Lahir : %s %s %s ",tanggal,blnNama[intBln],tahun));
        System.out.println("Status : " + status);
        System.out.println("Nomor KTP : " + NIK);

        input.nextLine();
        System.out.print("\nTekan enter untuk kembali ke Menu...");
        input.nextLine();

        menu();
    }

    public static void updateData() {
        String subMenu;

        System.out.println("\n--------------------------------------------\n");
        System.out.println("         **    Update Data:    **         ");
        System.out.println("1. Nama");
        System.out.println("2. Alamat");
        System.out.println("3. Nomor Handphone");
        System.out.println("4. Tanggal Lahir");
        System.out.println("5. Status");
        System.out.println("6. Nomor KTP");
        System.out.println("7. Kembali\n");

        System.out.print("Silahkan pilih data yang akan diupdate: ");
        subMenu = input.nextLine();

        try {
            switch (subMenu) {
                case "1" : menu1();break;
                case "2" : menu2();break;
                case "3" : menu3();break;
                case "4" : menu4();break;
                case "5" : menu5();break;
                case "6" : menu6();break;
                case "7" : menu();break;
                default : System.out.println("Menu yang Anda pilih tidak tersedia!");updateData();
            }
        } catch (Exception e) {
            System.out.println("Masukkan pilihan yang benar!");
        }
    }

    public static void menu1() {
//        input.nextLine(); //Mengatasi Scanner melewatkan .nextLine()
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        updateData();

    }

    public static void menu2() {
//        input.nextLine(); //Mengatasi Scanner melewatkan .nextLine()
        System.out.print("Masukkan alamat: ");
        alamat = input.nextLine();

        updateData();

    }

    public static void menu3() {
//        input.nextLine(); //Mengatasi Scanner melewatkan .nextLine()
        System.out.print("Masukkan nomor handphone: ");
        noHP = input.nextLine();

        updateData();

    }

    public static void menu4() {
        Cek ck = new Cek();

        try {
            System.out.print("Tanggal Lahir (dd-mm-yyy): ");
            tglLahir = input.next();

            if (ck.TglValid(tglLahir)) {
                tanggal = tglLahir.substring(0,2);
                bulan = tglLahir.substring(3,5);
                tahun = tglLahir.substring(6);
                intBln = (Integer.parseInt(bulan))-1;
            }
            else {
                System.out.println("\nFormat tanggal yang dimasukkan salah!");
                menu4();
            }
        } catch (Exception e) {
            System.out.println("Masukkan data yang benar!");
        }

        updateData();

    }

    public static void menu5() {
//        input.nextLine(); //Mengatasi Scanner melewatkan .nextLine()
        System.out.print("Masukkan status: ");
        status = input.nextLine();

        updateData();

    }

    public static void menu6() {
        System.out.print("Masukkan nomor KTP: ");
        NIK = input.next();

        updateData();

    }

    public static void  keluar() {
        char jawab;

//        try {
            do {
                System.out.println("\nYakin akan keluar? [Y|N]");
                jawab = input.next().charAt(0);

                if (jawab == 'Y' || jawab == 'y') {
                    System.out.println("==== TERIMA KASIH DAN SAMPAI JUMPA ====");
                    System.exit(0);
                }
                else if (jawab == 'N' || jawab == 'n') {
                    menu();
                }
                else {
                    System.out.println("Masukkan pilihan yang benar!");
                }
            } while (jawab != 'Y' || jawab != 'y' || jawab != 'N' || jawab != 'n');
//        } catch (Exception e) {
//            System.out.println("Masukkan pilihan yang benar!");
            keluar();
//        }
    }

}

class Cek {
    //mengecek validasi tanggal yang di input
    public static boolean TglValid(String tgl){
        String pola="dd-MM-yyyy";
        try {
            SimpleDateFormat format = new SimpleDateFormat(pola);
            format.setLenient(false);
            Date date = format.parse(tgl);
            return true;
        }
        catch (ParseException ex){
            return false;
        }
    }
}
