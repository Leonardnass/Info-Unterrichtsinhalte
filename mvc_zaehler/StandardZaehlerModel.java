package mvc_zaehler;

import java.util.ArrayList;


public class StandardZaehlerModel implements ZaehlerModel
{
    private int zahl;
    private ArrayList<ZaehlerBeobachter> beobachter;


    public StandardZaehlerModel(){
        zahl = 0;
        beobachter = new ArrayList<ZaehlerBeobachter>();
    }


    public void zahlErhoehen(){
        zahl++;
        // Alle Beobachter über die Änderung informieren
        for(ZaehlerBeobachter b : beobachter){
            b.zahlGeaendert();
        }
    }
    public void zahlVerringern(){
        zahl--;
        // Alle Beobachter über die Änderung informieren
        for(ZaehlerBeobachter b : beobachter){
            b.zahlGeaendert();
        }
    }
    public int gibZahl(){
        return zahl;
    }

    public void registrieren(ZaehlerBeobachter b){
        beobachter.add(b);
    }
    public void abmelden(ZaehlerBeobachter b){
        beobachter.remove(b);
    }
}

