package pkg02warteschlangen;

public class Liste {
    private Knoten erster;
    private int anzahl;

    public Liste() {
        erster = null;
        anzahl = 0;
    }

    public Knoten ersterGeben() {
        return erster;
    }

    public int anzahlGeben() {
        return anzahl;
    }

    public void listeAusgeben() {
        Knoten merke = erster;
        for (int i = 0; i < anzahl; i++) {
            System.out.println(merke.inhaltGeben().datenwertGeben());
            merke = merke.naechstenGeben();
        }
    }

    public Knoten erstenEntfernen() {
        Knoten rueckgabe = erster;
        erster = erster.naechstenGeben();
        anzahl--;
        return rueckgabe; 
    }

    public void obenHinzufuegen(Element neu) {
        Knoten merke = erster;
        erster = new Knoten(neu);
        erster.naechstenSetzen(merke);
        anzahl++;
    }

    public void untenHinzufuegen(Element neu) {
        erster.hinzufuegen(neu);
    }
    public void vorneEinfügen(Element neu){
        erster = new Knoten (neu, erster);
    }
    public void hintenEinfuegen(Element neu){
        if(erster == null){
            erster = new Knoten (neu, null);
        }else{
            erster.hintenEinfügen(neu);
        }
    }
    public void einfügenVor(Element neu, Element vergleich){
        if (erster == null){
            System.out.println("Element nicht vorhanden");
        }else {
            if (erster.inhaltGeben().equals(vergleich)){
                erster = new Knoten (neu, erster);
            }
            else {
                erster.einfügenVor(neu, vergleich);
            }
        }
    }
    public void sortiertEnfügen(Element neu){
        if ( erster == null){
            erster = new Knoten (neu);
        }else if ( erster.inhaltGeben().datenwertGeben().compareTo(neu.datenwertGeben()) > 0){
            erster = new Knoten (neu, erster);
        }
        else {
            erster.sortiertEinfügen(neu);
        }
    }
}
