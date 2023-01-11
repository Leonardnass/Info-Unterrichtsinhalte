package pkg05Baum;


public abstract class Datenelement {
    public abstract int zahlenwertGeben();
    public abstract String textWertGeben();
    public abstract boolean istGleich(Datenelement v);
    public abstract boolean istGroesser(Datenelement v);
    public abstract boolean istKleiner(Datenelement v);
    public abstract boolean istGleich(int v);
    public abstract boolean istGroesser(int v);
    public abstract boolean istKleiner(int v);
}
