package wertbeobachtervorlage;

public interface DatenInterface {
    public void registrieren(DatenBeobachter neu);

    public void abmelden(DatenBeobachter weg);

    public int datenGeben();
}
