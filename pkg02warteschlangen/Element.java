package pkg02warteschlangen;

public class Element {
    private String bezeichner;

    public Element(String bezeichner) {
        this.bezeichner = bezeichner;
    }

    public String datenwertGeben() {
        return bezeichner;
    }
}
