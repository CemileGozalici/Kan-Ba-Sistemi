package Factory;

public class ABPozitif extends KanGrubu {

    private String ad;
    private String Rh;
    private String alir;
    private String verir;
    private String bilgi;

    public ABPozitif(String ad, String Rh, String alir, String verir, String bilgi) {
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
        this.bilgi = "\n\t- AB grubu MODERN olarak adlandırılmıştır\n"
                + "\t- Her 100 kişiden 3’ü AB RH pozitif\n "
                + "\t- En ilginç insanlardır.\n";
        return this.bilgi;
    }
}
