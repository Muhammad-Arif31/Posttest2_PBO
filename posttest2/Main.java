/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;

/**
 *
 * @author User
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Kapal> data =  new ArrayList<>();
    static Scanner Masukkan = new Scanner(System.in);
        
    public static void TambahData(){
        int no_kapal;
        String nama_kapal;
        String warna_kapal;
        int harga_kapal;
        String asal_kapal;
        System.out.print("No.Kapal    : ");
        no_kapal = Masukkan.nextInt();
        System.out.print("Nama Kapal  : ");
        nama_kapal = Masukkan.next();
        System.out.print("Warna Kapal : ");
        warna_kapal = Masukkan.next();
        System.out.print("Harga Kapal : ");
        harga_kapal = Masukkan.nextInt();
        System.out.print("Asal Kapal  : ");
        asal_kapal = Masukkan.next();
        Kapal kapal = new Kapal();
        kapal.setNo(no_kapal);
        kapal.setNama_Kapal(nama_kapal);
        kapal.setWarna_Kapal(warna_kapal);
        kapal.setHarga(harga_kapal);
        kapal.setAsal_Kapal(asal_kapal);
        data.add(kapal);
        kapal.Sukses();
    }

    public static void HapusData(){
        String hapus;
        System.out.print("Masukkan Indeks Kapal yang ingin dihapus : ");
        hapus = Masukkan.next();
        data.remove((int)Integer.valueOf(hapus));
        Kapal kapal = new Kapal();
        kapal.Gagal();
    }

    public static void UbahData(){
        int no_kapal;
        String nama_kapal;
        String warna_kapal;
        int harga_kapal;
        String asal_kapal;
        System.out.print("Pilih Indeks Kapal yang ingin diubah : ");
        int pilihan = Masukkan.nextInt();
        System.out.print("No.Kapal    : ");
        no_kapal = Masukkan.nextInt();
        System.out.print("Nama Kapal  : ");
        nama_kapal = Masukkan.next();
        System.out.print("Warna Kapal : ");
        warna_kapal = Masukkan.next();
        System.out.print("Harga Kapal : ");
        harga_kapal = Masukkan.nextInt();
        System.out.print("Asal Kapal  : ");
        asal_kapal = Masukkan.next();
        
        data.get(pilihan-1).setNo(no_kapal);
        data.get(pilihan-1).setNama_Kapal(nama_kapal);
        data.get(pilihan-1).setWarna_Kapal(warna_kapal);
        data.get(pilihan-1).setHarga(harga_kapal);
        data.get(pilihan-1).setAsal_Kapal(asal_kapal);
        Kapal kapal = new Kapal();
        kapal.Diubah();
    }

    public static void showData(){
        for(int i=0; i< data.size();i++){
            System.out.println("|==================================|");
            System.out.println("No.Kapal    = "+data.get(i).getno());
            System.out.println("Nama Kapal  = "+data.get(i).getnama());
            System.out.println("Warna Kapal = "+data.get(i).getwarna());
            System.out.println("Harga Kapal = "+data.get(i).getprice());
            System.out.println("Asal Kapal  = "+data.get(i).getasal());
            System.out.println("|==================================|");
        }
    }

    public static void main(String[] args) {
        int Ngulang = 1;
        while(Ngulang==1){
            System.out.println("\n/==========================\\");
            System.out.println("| No| Menu Pendataan Kapal |");
            System.out.println("|==========================|");
            System.out.println("| 1.| Tambah Data          |");
            System.out.println("| 2.| Lihat Data           |");
            System.out.println("| 3.| Ubah Data            |");
            System.out.println("| 4.| Hapus Data           |");
            System.out.println("| 5.| Keluar               |");
            System.out.println("\\==========================/");
            System.out.print("Masukkan Pilihanmu [1-5] : ");
            int pilih;
            pilih = Masukkan.nextInt();
            if (pilih == 1){
                TambahData();
            }else if(pilih == 2){
                showData();
            }else if(pilih == 3){
                UbahData();
            }else if(pilih == 4){
                HapusData();
            }else if(pilih == 5){
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                System.exit(0);
            } else {
                System.out.println("Kamu salah memasukkan pilihan menu!");
            }
        }
    }  
}
