package pkg08wiederholung;

public class PatientenwarteSchlange {
    private Patient[] wartende;
    private int anzahl;
    private int zaehlerErster;
    private int zaehlerLetzter;
    public PatientenwarteSchlange(int maxZahl) {
        anzahl = 0;
        zaehlerErster = 0;
        zaehlerLetzter = 0;
        wartende = new Patient[maxZahl];
    }
    public Patient erstenAufrufen() {
        var result = wartende[zaehlerErster];
        zaehlerErster = (zaehlerErster + 1) % wartende.length;
        anzahl -= 1;
        return result;
    }
    public void hintenAnstellen(Patient p) {
        if (wartende[(zaehlerLetzter+1)%wartende.length] != null) {
            return;
        } 
        zaehlerLetzter = (zaehlerLetzter + 1) % wartende.length;
        anzahl += 1;
    }
    public int gibLaenge() {
        return anzahl;
    }
}
