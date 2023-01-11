package wertbeobachtervorlage;

public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Wert w = new Wert();
        AusgabeWertBeobachter b1 = new AusgabeWertBeobachter(w);
        AusgabeWertBeobachter b2 = new AusgabeWertBeobachter(w);
        for (int i = 0; i < 100; i = i + 15) {
            w.setzeWert(i);
        }
        w.abmelden(b1);
        for (int i = 0; i < 100; i = i + 5) {
            w.setzeWert(i);
        }
    }

}
