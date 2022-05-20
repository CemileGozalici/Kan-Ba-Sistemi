package Observer;

import java.util.ArrayList;

public class Hastane implements Subject {

    private String hastane;
    private ArrayList<Observer> bagisciler;

    public Hastane(String hastane) {

        this.hastane = hastane;
        bagisciler = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        bagisciler.add(o);
        System.out.println(o + " " + hastane + "neye kan bağışında bulunuyor:)");
    }

    @Override
    public void unregister(Observer o) {
        bagisciler.remove(o);
        System.out.println(o + " " + hastane + "neye kan bağışı yapmayı bıraktı:(");
    }

    @Override
    public void notifyAllobserver(String mesaj) {
        for (Observer bagisci : bagisciler) {
            bagisci.update(hastane, mesaj);
        }
        System.out.println();
    }

    public void mesaj(String mesaj) {

        System.out.println("\n" + hastane + "="
                + mesaj + "\n");
        notifyAllobserver(mesaj);
    }

}
