package wertbeobachtervorlage;

public class AusgabeWertBeobachter implements DatenBeobachter {

    private DatenInterface datenInterface;

    public AusgabeWertBeobachter(DatenInterface dInterface) {
        datenInterface = dInterface;
        datenInterface.registrieren(this);
    }

    private void wertAusgeben(int wert) {
        System.out.println("Neuer Wert: " + wert);
    }

    @Override
    public void datenGeaendert() {
        wertAusgeben(datenInterface.datenGeben());
    }
}
