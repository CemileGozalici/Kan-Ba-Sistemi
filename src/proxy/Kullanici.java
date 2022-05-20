package proxy;

public class Kullanici {

    private String kullaniciAdi;
    private String sifre;
    private boolean doktor;

    public Kullanici(String kullaniciAdi, String sifre, boolean doktor) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.doktor = doktor;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public boolean Doktor() {
        return doktor;
    }

    public void setDoktor(boolean doktor) {
        this.doktor = doktor;
    }

}
