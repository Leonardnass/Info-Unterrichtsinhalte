package pkg02warteschlangen;

public class Knoten {
    private Element element;
    private Knoten naechster;

    public Knoten(Element inhalt) {
        this.element = inhalt;
        this.naechster = null;
    }

    public Knoten naechstenGeben() {
        return naechster;
    }

    public void naechstenSetzen(Knoten knoten) {
        naechster = knoten;
    }

    public void hinzufuegen(Element e) {
        if (naechster != null) naechster.hinzufuegen(e);
        else                   naechster = new Knoten(e);
    }

    public void hinzufuegen(Knoten k) {
        if (naechster != null) naechster.hinzufuegen(k);
        else                   naechster = k;
    }

    public Element inhaltGeben() {
        return element;
    }
    
    public void inhaltSetzen(Element inhalt) {
        this.element = inhalt;
    }

    public int knotenZahlDannachGeben() {
        if (naechster == null)  return 1;
        else                    return naechster.knotenZahlDannachGeben() + 1;
    }
    public Knoten (Element e, Knoten n){
        element = e;
        naechster = n;
    }
    public void hintenEinfügen(Element neu){
        if(naechster == null) {
            naechster = new Knoten (neu, null);
        }
        else {
            naechster.hintenEinfügen(neu);
        }
    }
    public void einfügenVor(Element neu, Element vergleich){
        if (naechster == null){
            System.out.println("Element nicht vorhanden");
        }else {
            if (naechster.inhaltGeben().equals(vergleich)){
                naechster = new Knoten (neu, naechster);
            }
            else {
                naechster.einfügenVor(neu, vergleich);
            }
        }
    }
    public void sortiertEinfügen(Element neu){
        if (naechster == null){
            naechster = new Knoten (neu);
        } else if (naechster.inhaltGeben().datenwertGeben().compareTo(neu.datenwertGeben()) > 0){
            naechster = new Knoten (neu, naechster);
        }
        else {
            naechster.sortiertEinfügen(neu);
        }
    }
}
