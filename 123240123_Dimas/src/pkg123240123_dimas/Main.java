/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123240123_dimas;
import java.util.*;
/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> namaList = new ArrayList<>();
        ArrayList<PaketKursus> paketList = new ArrayList<>();
        
        while(true) {
            System.out.println("=== SISTEM KURSUS - StudiKita ===");
            System.out.println("1. Daftar Peserta");
            System.out.println("2. Keluar");
            System.out.println("Pilih: ");
                int menu = input.nextInt();
                input.nextLine();

            if(menu == 1) {
                try {
                    System.out.println("Nama Peserta: ");
                    String nama = input.nextLine();
                    
                    System.out.println("Nomor Telepon: ");
                    String telp = input.nextLine();
                    
                    if(!telp.matches("[0-9]+")){
                        System.out.println("Nomor Telepon Harus Angka");
                        continue;
                    }
                    Peserta peserta = new Peserta(nama, telp);
                    
                    System.out.println("Harga Paket: ");
                    double harga = input.nextDouble();
                    
                    System.out.println("Jenis Paket (1=Online/2=Offline/3=Bundle): ");
                    
                    int jenis = input.nextInt();
                    PaketKursus paket = null;
                    
                    boolean X = true;
                        if (jenis == 1) {
                            X = false;
                            paket = new KursusOnline(harga);
                        } else if (jenis == 2) {
                            X = false;
                            paket = new KursusOffline(harga);
                        } else if (jenis == 3) {
                            X = false;
                            paket = new KursusBundle(harga);
                        } else {
                            System.out.println("Pilihan tidak ada, Ulangi");
                        }
                    
                    namaList.add(peserta.getNama());
                    paketList.add(paket);
                    
                    System.out.println("Pesanan Berhasil Ditambahkan :)");
                } catch(DataKursusTidakValidException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if(menu == 2) {
                System.out.println("--- Data Peserta ---");
                for(int i = 0; i < namaList.size(); i++){
                    PaketKursus p = paketList.get(i);
                    
                    System.out.println("Nama: " + namaList.get(i));
                    System.out.println("Paket: " + p.getNamaKursus());
                    System.out.println("Total Biaya: " + p.hitungTotalBiaya());
                    System.out.println("-------------------------");
                
                    if(p instanceof Perpanjang perpanjang) {
                        perpanjang.cetakInfoPerpanjangan(30);
                    }
                }
                break;
            } else {
                System.out.println("invalid");
            }
        }
    }
    
}
