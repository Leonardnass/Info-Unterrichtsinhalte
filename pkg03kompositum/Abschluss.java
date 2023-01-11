package pkg03kompositum;

public class Abschluss extends Listenelement{

    @Override
    public Listenelement naechsterGeben() {
        return this;
    }

    @Override
    public Element inhaltGeben() {
        return new Element("", 2);
    }

    @Override
    public Knoten hintenEinfuegen(Element e) {
        return new Knoten(e, this);
    }

    @Override
    public void listeAusgeben() {
        return;
    }

    @Override
    public int laengeGeben() {
        return 0;
    }

    @Override
    public int suchen(Element _0, int _1) {
        return -1;
    }

    @Override
    public void entfernen(int index) {}

    @Override
    public Listenelement sortiertEinfuegen(Element e) {
        return new Knoten (e, this);
    }

    @Override
    public Element AnfangGeben() {
        return null;
    }

    @Override
    public boolean IstLeer(){
        return true;
    }
}
