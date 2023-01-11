package pkg03kompositum;

public class Element {
    private String bezeichner;
    private int Zahl;

    public Element(String bezeichner, int _wasAuchImmer) {
        this.bezeichner = bezeichner;
    }

    public String datenwertGeben() {
        return bezeichner;
    }

    public boolean istGreoesser(Element v){
        if (v.Zahl > this.Zahl)
        return true;
        return false;
    }
}


