package pkg03kompositum;

public class Knoten extends Listenelement{
    private Listenelement naechster;
    private Element inhalt;

    public Knoten(Element inhalt, Listenelement naechster) {
        super();
        this.naechster = naechster;
        this.inhalt = inhalt;
    }

    @Override
    public Listenelement naechsterGeben() {
        return naechster;
    }

    @Override
    public Element inhaltGeben() {
        return inhalt;
    }

    @Override
    public Knoten hintenEinfuegen(Element e) {
        naechster = naechster.hintenEinfuegen(e); 
        return this; 
    }

    @Override
    public void listeAusgeben() {
        System.out.println(inhalt.datenwertGeben());
        naechster.listeAusgeben();
    }

    @Override
    public int laengeGeben() {
        return naechster.laengeGeben() + 1;
    }
    
    @Override
    public int suchen(Element e, int index) {
        if (e.equals(inhalt)) return index;
        else                  return naechster.suchen(e, index+1);
    }

    @Override
    public void entfernen(int index) {
        if (index == 0) naechster = naechster.naechsterGeben();
        else            naechster.entfernen(index-1);
    }

    @Override
    public Listenelement sortiertEinfuegen(Element neu) {
        if (neu.istGreoesser(inhalt))
            return new Knoten (neu, naechster);
        naechster = naechster.sortiertEinfuegen(neu);
        return this;
    }

    @Override
    public Element AnfangGeben() {
        return inhalt;
    }

    @Override
    public boolean IstLeer() {
        return false;
    }
}
