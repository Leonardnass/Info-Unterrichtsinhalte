package pkg02warteschlangen;

public class Knoten2 extends listemitcompositum{
    private Element element;
    private listemitcompositum naechster;
    public Knoten2 (Element inhalt){
        super();
        this.element = inhalt;
        this.naechster = null;
    }
    public Knoten2(listemitcompositum k, Element e){
        super();
        this.naechster = k;
        this.element = e;
    }
    public listemitcompositum naechsterGeben(){
        return naechster;
    }
    public Element inhaltGeben(){
        return element;
    }
    public void naechstensetzen(listemitcompositum knoten){
        naechster = knoten;
    }
    public listemitcompositum hintenEinfuegen(Element e){
        naechster = naechster.hintenEinfuegen(e);
        return this;
    }
    @Override
    public void listeAusgeben() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public int laengeGeben() {
        // TODO Auto-generated method stub
        return 0;
    }
}
