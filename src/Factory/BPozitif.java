package Factory;

public class BPozitif extends KanGrubu {

    private String ad;
    private String Rh;
    private String alir;
    private String verir;
    private String bilgi;

    public BPozitif(String ad, String Rh, String alir, String verir, String bilgi) {
        this.ad = ad;
        this.Rh = Rh;
        this.alir = alir;
        this.verir = verir;
        this.bilgi = bilgi;
    }

    @Override
    public String getAd() {
        return this.ad;
    }

    @Override
    public String getRh() {
        return this.Rh;
    }

    @Override
    public String getAlir() {
        return this.alir;
    }

    @Override
    public String getVerir() {
        return this.verir;
    }

    @Override
    public String getBilgi() {
        this.bilgi = "\n\t- B grubu GÖÇEBE olarak adlandırılmıştır\n"
                + "\t- Her 100 kişiden 8’i B RH pozitif\n"
                + "\t- Uyumlu, iletişimi yüksek ve yaratıcı fikirlere sahiptirler\n";
        return this.bilgi;
    }
}
