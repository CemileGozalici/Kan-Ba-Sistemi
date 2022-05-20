package Observer;

public class Bagisciler implements Observer {

    private String BagisciAdi;

    public Bagisciler(String BagisciAdi) {
        this.BagisciAdi = BagisciAdi;
    }

    @Override
    public void update(String hastane, String mesaj) {
        System.out.println(BagisciAdi + "in " + hastane + " den aldiği mesaj=" + mesaj);
    }
 @Override
    public String toString() {
        return BagisciAdi;
    }
}
