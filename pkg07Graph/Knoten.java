package pkg07Graph;

public class Knoten {
    private Datenelement daten;
    public boolean markierung;

    public Knoten(Datenelement daten) {
        this.daten = daten;
    }

    public Datenelement gibDaten() {
        return this.daten;
    }
}
