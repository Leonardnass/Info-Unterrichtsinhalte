package pkg02warteschlangen;

public class TaxiWarteschlange {
    Taxi[] taxis;
    int anzahl;
    int maxAnzahl;
    public TaxiWarteschlange() {
        taxis = new Taxi[5];
        anzahl = 0;
    }
    public void hintenAnstellen(Taxi taxi) {
        if (anzahl >= taxis.length) {
            System.out.println("kein Platz");
            return;
        }
        taxis[anzahl] = taxi;
        anzahl++;
    }
    public Taxi abfahren() {
        if (anzahl == 0) {
            System.out.println("kein Taxi zum Abfahren da!");
            return null;
        }
        Taxi abzufahrend = taxis[0];
        for (int i = 0; i < anzahl; i++) {
            taxis[i] = taxis[i+1];
        }
        anzahl--;
        taxis[anzahl] = null;
        return abzufahrend;
    }
    public void fahrerlisteAusgeben() {
        for (int i = 0; i < anzahl; i++) {
            System.out.println(taxis[i].fahrerGeben());
        }
    }
}
