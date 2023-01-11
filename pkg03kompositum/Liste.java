package pkg03kompositum;

public class Liste {
    Listenelement erster; 
 
    public Liste() { 
        erster = new Abschluss(); 
    } 

    public void hintenEinfuegen(Element e) { 
        erster=erster.hintenEinfuegen(e); 
    } 
    
    public void listeAusgeben() { 
        erster.listeAusgeben(); 
    } 
 
    public int laengeGeben() { 
        return erster.laengeGeben(); 
    }

    public void vorneEinfuegen(Element e) {
        erster = new Knoten(e, erster);
    }

    public int suchen(Element e) {
        return erster.suchen(e, 1);
    }
    public void entfernen(int index) {
        if (index == 0) erster = erster.naechsterGeben();
        else            erster.entfernen(index-1);
    }
    public void sortiertEinfuegen(Element e){
        erster.sortiertEinfuegen(e);
    }
    public Element AnfangGeben(){
        return erster.AnfangGeben();
    }
    public boolean IstLeer(){
        return erster.IstLeer();
    }

    public void AnfangEntfernen(Element neueDaten) {
        if (erster == null)erster = erster.naechsterGeben();
        else erster.AnfangEntfernen(neueDaten);
    }
}





