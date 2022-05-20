
package proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class YetkiliKullaniciler {
     public static List<Kullanici> getKullaniciList(){

        Kullanici elif = new Kullanici("elif", "123", true);
        Kullanici ahmet = new Kullanici("ahmet", "1234", true);
        Kullanici busra = new Kullanici("busra", "12345", true);

        List<Kullanici> kullaniciList = new ArrayList<>();
        kullaniciList.add(elif);
        kullaniciList.add(ahmet);
        kullaniciList.add(busra);

        return kullaniciList;

    }

    public static Map<String, Kullanici> getKullaniciAdiKullaniciMap(){

        List<Kullanici> kullaniciList = getKullaniciList();

        Map<String, Kullanici> map = new LinkedHashMap<>();
        for (Kullanici kullanici : kullaniciList) {
            map.put(kullanici.getKullaniciAdi(), kullanici);
        }

        return map;
    }

    public static Kullanici getKullaniciAdi(String kullaniciAdi){

        Map<String, Kullanici> map = getKullaniciAdiKullaniciMap();

        Kullanici kullanici = map.get(kullaniciAdi);

        return kullanici;
    }

    public static boolean gecerliKullanici(String kullaniciAdi, String sifre) {

        boolean gecerliKullanici = false;

        Kullanici kullanici = getKullaniciAdi(kullaniciAdi);

        if (kullanici != null){

           gecerliKullanici = kullanici.getSifre().equals(sifre);
        }

        return gecerliKullanici;
    }
}
