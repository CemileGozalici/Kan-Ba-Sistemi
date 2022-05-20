
package Factory;


public class APozitif extends KanGrubu {

    private String ad;
    private String Rh;
    private String alir;
    private String verir;
    private String bilgi;

    public APozitif(String ad, String Rh, String alir, String verir, String bilgi) {
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
        this.bilgi="\n\t- A grubu ÇİFTCİ olarak adlandırılmıştır\n"
                + "\t- Her 100 kişiden 34’ü A RH pozitif\n"
                + "\t- Ülkemizde en çok rastlanan kan grubudur.\n"
                + "\t- Türkiye’de Kızılay’ın verilerine göre en fazla bulunan, en çok ihtiyaç duyulan grup A Rh(+)’dir.\n"
                + "\t- LDL (kötü kolestrol), tip 2 diyabet ve mide kanserine daha sık rastlanır.\n"
                + "\t- Sinirli ve hassas bir yapıya sahiptirler.\n";
        return this.bilgi;
    }

}
