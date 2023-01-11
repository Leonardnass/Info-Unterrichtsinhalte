package pkg02warteschlangen;

public class ListenTest {
    public static void testen() {
        Element e1 = new Element("Apfel");
        Element e2 = new Element("Birne");
        Element e3 = new Element("Zitrone");
        Element e4 = new Element("Dattel");
        
        
        Liste s=new Liste();
        s.obenHinzufuegen(e1);
        s.obenHinzufuegen(e2);
        
        s.listeAusgeben();
        
        s.obenHinzufuegen(e3);
        s.obenHinzufuegen(e4);
        
        s.listeAusgeben();
    }
}
