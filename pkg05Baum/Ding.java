package pkg05Baum;

public class Ding extends Datenelement{
    private int zahl;
    private String text;

    public Ding (String text, int zahl){
        this.text = text;
        this.zahl = zahl;
    }

    @Override
    public int zahlenwertGeben() {
        return zahl;
    }

    @Override
    public String textWertGeben() {
        return text;
    }

    @Override
    public boolean istGleich(Datenelement v) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean istGroesser(Datenelement v) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean istKleiner(Datenelement v) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean istGleich(int v) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean istGroesser(int v) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean istKleiner(int v) {
        // TODO Auto-generated method stub
        return false;
    }

}