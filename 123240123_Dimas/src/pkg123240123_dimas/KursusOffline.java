/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123240123_dimas;

/**
 *
 * @author Lab Informatika
 */
public class KursusOffline extends PaketKursus implements Perpanjang{
    public KursusOffline (double hargaKursus) throws DataKursusTidakValidException {
     super("Kursus Offline", hargaKursus);   
    }
    
    @Override
    public double hitungTotalBiaya() {
        return hargaKursus + 50000;
    }
    @Override
    public void cetakInfoPerpanjangan(int hariTambahan){
        System.out.println("Perpanjang: Rp." + (hargaKursus * 0.1 * hariTambahan) + "untuk 30 hari tambahan");
    }
}
