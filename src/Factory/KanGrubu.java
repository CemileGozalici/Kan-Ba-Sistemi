package Factory;

public abstract class KanGrubu {

    public abstract String getAd();

    public abstract String getRh();

    public abstract String getAlir();

    public abstract String getVerir();

    public abstract String getBilgi();

    @Override
    public String toString() {
        return "Kan grubu=" + this.getAd() + "\n"
                + "Rh=" + this.getRh() + "\n"
                + "Hangi grublardan kan ALIR= " + this.getAlir() + "\n"
                + "hangi grublara kan VERİR= " + this.getVerir() + "\n"
                + "Kan grubları hakkında BİLGİ= " + this.getBilgi();
    }
}
