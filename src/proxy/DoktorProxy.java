
package proxy;

import entity.Bagisci;
import java.util.List;


public class DoktorProxy implements BagisciBilgileri {

    private DoktorErisim doktorErisim;
    private String kullaniciAdi;
    private String sifre;

    public DoktorProxy(String kullaniciAdi, String sifre) {
        this.doktorErisim = new DoktorErisim();
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    private boolean KullaniciDoktor() {

        boolean KullaniciDoktor = false;

        boolean Kullanici = YetkiliKullaniciler.gecerliKullanici(kullaniciAdi, sifre);

        if (Kullanici) {
            Kullanici kullanici = YetkiliKullaniciler.getKullaniciAdi(kullaniciAdi);

            KullaniciDoktor = kullanici.Doktor();
        }

        return KullaniciDoktor;
    }

    @Override
    public List<Bagisci> getBagiscilist() throws IllegalAccessException {
        boolean kullaniciDoktor = KullaniciDoktor();

        if (kullaniciDoktor) {
            return doktorErisim.getBagiscilist();
        } else {
            throw new IllegalAccessException();
        }
    }

    public void Listele() throws IllegalAccessException {
        List<Bagisci> list2 = getBagiscilist();
        System.out.println("\nBağışçı bilgileri:\n");
        for (Bagisci c : list2) {
            System.out.println(c);
        }
    }
}
