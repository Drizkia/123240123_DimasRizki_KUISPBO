/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123240123_dimas;

/**
 *
 * @author Lab Informatika
 */
public class KursusBundle extends PaketKursus implements Perpanjang{
    public KursusBundle(double hargaKursus) throws DataKursusTidakValidException{
       super("Kursus Bundle", hargaKursus); 
    }
    
    @Override
    public double hitungTotalBiaya(){
        return hargaKursus + 150000;
    }
    
    @Override
    public void cetakInfoPerpanjangan(int hariTambahan){
        System.out.println("Perpanjang: Rp." + (hargaKursus * 0.05 * hariTambahan) + "untuk 30 hari tambahan");
    }
}
