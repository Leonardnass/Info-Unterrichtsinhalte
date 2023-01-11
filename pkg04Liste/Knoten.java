package pkg04Liste;

public class Knoten {
    private Element inhalt;
    private Knoten naechster;

    public Knoten(Element neu){
        inhalt = neu;
        naechster = null;
    }
    
    public Knoten naechstenGeben(){
        return naechster;
    }

    public void naechstenSetzten(Knoten neu){
        naechster = neu;
    }

    public Element inhaltGeben(){
        return inhalt;
    }
}
