package mvc_zaehler;

public interface ZaehlerModel
{
    int gibZahl();

    void registrieren(ZaehlerBeobachter beobachter);
    void abmelden(ZaehlerBeobachter beobachter);
}
