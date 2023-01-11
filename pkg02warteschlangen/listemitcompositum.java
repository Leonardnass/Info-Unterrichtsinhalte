package pkg02warteschlangen;

public abstract class listemitcompositum {
    listemitcompositum() {}
    public abstract listemitcompositum naechsterGeben();

    public abstract Element inhaltGeben();

    public abstract listemitcompositum hintenEinfuegen(Element e);

    public abstract void listeAusgeben();
    
    public abstract int laengeGeben();
}
