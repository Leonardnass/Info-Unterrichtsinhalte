package wertbeobachtervorlage;

import java.util.ArrayList;

public class Wert implements DatenInterface {
    private int wert;
    private ArrayList<DatenBeobachter> beobachter;

    public Wert() {
        wert = 0;
        beobachter = new ArrayList<DatenBeobachter>();
    }


    public int datenGeben() {
        return wert;
    }

    public void setzeWert(int neuerWert) {
        wert = neuerWert;
        for (var x : beobachter) {
            x.datenGeaendert();
        }
    }


    @Override
    public void registrieren(DatenBeobachter neu) {
        beobachter.add(neu);
    }


    @Override
    public void abmelden(DatenBeobachter weg) {
        beobachter.remove(weg);
    }
}
