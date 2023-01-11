package pkg02warteschlangen;

/**
 * Eine Warteschlange fuer {@link pkg02warteschlangen.Patient}, die nach dem FIFO Prinzip arbeitet.
 */
public class PatientenWarteschlange {
    private Patient[] wartende;
    private int anzahl;
    public PatientenWarteschlange(int maxZahl) {
        anzahl = 0;
        wartende = new Patient[maxZahl];
    }
    public PatientenWarteschlange() {
        anzahl = 0;
        wartende = new Patient[20];
    }
    /**
     * Gibt den nächsten Patienten aus und entfernt ihn aus der Warteschlange.
     * @return Der nächste Patient
     */
    public Patient erstenAufrufen() {
        if (anzahl < 0) {
            System.out.println("leer kek");
            return null;
        }
        var ausgerufener = wartende[0];
        for (int i = 0; i < anzahl - 1; i++) {
            wartende[i] = wartende[i+1];
        }
        anzahl--;
        wartende[anzahl - 1] = null;
        return ausgerufener;
    }
    /**
     * Stellt einen Patienten hinten an.
     * @param patient Der Hinzuzufuegende Patient
     */
    public void hintenAnstellen(Patient patient) {
        if (anzahl < wartende.length) {
            wartende[anzahl] = patient;
            anzahl++;
        } else {
            System.out.println("kein Platz");
        }
    }
    /**
     * 
     * @return Die aktuelle Länge der Warteschlange
     */
    public int anzahlGeben() {
        return anzahl;
    }
    
    public String[] namenlisteGeben() {
        String[] namen = new String[anzahl];
        for (int i = 0; i < anzahl; i++) {
            namen[i] = wartende[i].gibName();
        }
        return namen;
    }
    
    public void namenListeGeben(){
        if (anzahl == 0){
            System.out.println("Wartezimmer ist leer");
        } else{
        for (int i = 0; i < anzahl; i++){
            System.out.println (i + ". " + wartende[i].gibName);
            }
        }   
    }
    public void geburtstagslisteGeben(){
        if (anzahl == 0){
            System.out.println("Wartezimmer ist Leer");
        } else {
            for (int i = 0; i < anzahl; i++){
                System.out.println( i + ". " + wartende[i].gibGeburtsdatum);
            }
        }
    }
}
