/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


public class Doktor {

    private int id;
    private String adSoyad;
    private String Hastane;

    public Doktor(int id, String adSoyad, String Hastane) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.Hastane = Hastane;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getHastane() {
        return Hastane;
    }

    public void setHastane(String Hastane) {
        this.Hastane = Hastane;
    }

    @Override
    public String toString() {
        return "Doktor{" + "id=" + id + ", adSoyad=" + adSoyad + ", Hastane=" + Hastane + '}';
    }
    
}
