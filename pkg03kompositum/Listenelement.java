package pkg03kompositum;

public abstract class Listenelement {
    public abstract Listenelement naechsterGeben(); 
    public abstract Element inhaltGeben(); 
     
    public abstract Knoten hintenEinfuegen(Element e); 
    public abstract void listeAusgeben(); 
    public abstract int laengeGeben();
    public abstract int suchen(Element e, int index);
    public abstract void entfernen(int index);
    public abstract Listenelement sortiertEinfuegen(Element e);
    public abstract Element AnfangGeben();
    public abstract boolean IstLeer();
    public void AnfangEntfernen(Element neueDaten) {
    }
}
