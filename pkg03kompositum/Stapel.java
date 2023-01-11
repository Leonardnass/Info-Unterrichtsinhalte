package pkg03kompositum;

public class Stapel {

    private Liste liste;

    public Stapel(){
        liste = new Liste();
    }

    public void Einfuegen(Element neueDaten){
        liste.vorneEinfuegen(neueDaten);
    }

    public void Entfernen(Element neueDaten){
        liste.AnfangEntfernen(neueDaten);
    }
    public Element NaechsterGeben(){
        return liste.AnfangGeben();
    }

    public boolean istLeer(){
        return liste.IstLeer();
    }

}
