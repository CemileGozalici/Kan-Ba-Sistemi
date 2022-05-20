/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author user
 */
public class Bagisci {

    private int id;
    private int tc;
    private String adSoyad;
    private int kangrubu;
    private String tarih;
    private int doktor;
    private String telefon;

    public Bagisci(int tc) {
        this.tc = tc;
    }

    public Bagisci(int tc, String adSoyad, int kangrubu, String tarih, int doktor, String telefon) {
        this.tc = tc;
        this.adSoyad = adSoyad;
        this.kangrubu = kangrubu;
        this.tarih = tarih;
        this.doktor = doktor;
        this.telefon = telefon;
    }

    public Bagisci(int id, int tc, String adSoyad, int kangrubu, String tarih, int doktor, String telefon) {
        this.id = id;
        this.tc = tc;
        this.adSoyad = adSoyad;
        this.kangrubu = kangrubu;
        this.tarih = tarih;
        this.doktor = doktor;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getKangrubu() {
        return kangrubu;
    }

    public void setKangrubu(int kangrubu) {
        this.kangrubu = kangrubu;
    }

    public int getDoktor() {
        return doktor;
    }

    public void setDoktor(int doktor) {
        this.doktor = doktor;
    }

    @Override
    public String toString() {
        return "Bagisci{" + "tc=" + tc + ", adSoyad=" + adSoyad + ", kangrubu=" + kangrubu + ", tarih=" + tarih + ", doktor=" + doktor + ", telefon=" + telefon + '}';
    }

}
