package pkg05Baum;

public abstract class Baumelement {
    public abstract Datenelement suchen (int z);
    public abstract Baumelement einfügen (Datenelement neu);
    public abstract Baumelement entfernen (int i);
    public abstract Baumelement rechtsAnfuegen(Baumelement b);
    public abstract void PreOrder();
    public abstract void InOrder();
    public abstract void PostOrder();
}
