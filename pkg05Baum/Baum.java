package pkg05Baum;

public class Baum {
    private Baumelement erster;

    public Baum(){
        erster = new Abschluss();
    }

    public void einfügen(Datenelement neu){
        erster = erster.einfügen(neu);
    }
    public Datenelement	suchen(int z){
        return erster.suchen(z);
    }
}
