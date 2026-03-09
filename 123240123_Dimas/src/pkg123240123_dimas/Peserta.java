/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123240123_dimas;

/**
 *
 * @author Lab Informatika
 */
public class Peserta {
    private static int count = 1;
    
    private String idPeserta;
    private String nama;
    private String nomorTelepon;
    
    public Peserta(String nama, String nomorTelepon){
        this.idPeserta = String.format("S%03d", count++);
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }
    
    public String getidPeserta(){
        return idPeserta;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNomorTelepon(){
        return nomorTelepon;
    }
}
