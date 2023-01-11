package pkg05Baum;

public class Abschluss extends Baumelement {

    public Abschluss(){}

    @Override
    public Datenelement suchen(int z) {
        return null;
    }

    @Override
    public Baumelement einfügen(Datenelement e) {
        return new Knoten (e);
    }

    @Override
    public Baumelement entfernen(int i) {
        return this;
    }

    @Override
    public Baumelement rechtsAnfuegen(Baumelement b) {
        return b;
    }

    @Override
    public void PreOrder() {
    }

    @Override
    public void InOrder() {
    }

    @Override
    public void PostOrder() {
    }
}
