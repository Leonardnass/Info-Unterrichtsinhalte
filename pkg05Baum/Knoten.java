package pkg05Baum;

public class Knoten extends Baumelement {
    
    private Datenelement inhalt;
    private Baumelement linkerNachfolger;
    private Baumelement rechterNachfolger;

    public Knoten(Datenelement neu) {
        inhalt = neu;
        linkerNachfolger = new Abschluss();
        rechterNachfolger = new Abschluss();
    }

    public Datenelement suchen(int z) {
        if (inhalt.zahlenwertGeben() > z ){
                return linkerNachfolger.suchen(z);
        }else if (inhalt.zahlenwertGeben() < z ){
                return rechterNachfolger.suchen(z);
        }else return inhalt;
    }

    public Baumelement einfügen(Datenelement e){
        if (inhalt.zahlenwertGeben() > (e.zahlenwertGeben())){
                linkerNachfolger = linkerNachfolger.einfügen( e );
        }else if (inhalt.zahlenwertGeben() < (e.zahlenwertGeben())){ 
                rechterNachfolger = rechterNachfolger.einfügen(e);
        }else{
            System.out.println("Error");
        }
        return this;
    }
    
    public Baumelement entfernen(int i){
        if (inhalt.istGleich(i)){
            return linkerNachfolger.rechtsAnfuegen(rechterNachfolger);
        }else if (inhalt.istKleiner(i)){
            linkerNachfolger = linkerNachfolger.entfernen(i);
            return this;
        }else{
            rechterNachfolger = rechterNachfolger.entfernen(i);
            return this;
        }

    }

    public Baumelement rechtsAnfuegen(Baumelement b) {
       rechterNachfolger = rechterNachfolger.rechtsAnfuegen(b);
       return this;
    }

    @Override
    public void PreOrder() {
        System.out.println(inhalt);     
        linkerNachfolger.PreOrder();
        rechterNachfolger.PreOrder();   
    }

    @Override
    public void InOrder() {
        linkerNachfolger.PreOrder();
        System.out.println(inhalt);     
        rechterNachfolger.PreOrder();        
    }

    @Override
    public void PostOrder() {
        linkerNachfolger.PreOrder();
        rechterNachfolger.PreOrder();         
        System.out.println(inhalt);     
    }
}