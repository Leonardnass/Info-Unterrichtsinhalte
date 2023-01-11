package pkg02warteschlangen;

public class Patient {
    private String name, adresse, gebDat, krankenKasse;
    public int gibName;
    public int gibGeburtsdatum;
    /**
     * Erstellt einen Standardpatienten zu Testzwecken.
     * @hidden
     */
    public Patient() {
        name = "John Doe";
        adresse = "Weg";
        gebDat = "2000-01-01";
        krankenKasse = "";
    }
    /**
     * Erstellt einen Patienten mit den angegebenen Parametern
     * @param name Der Name des Patienten
     * @param adresse Die Adresse des Patienten
     * @param gebDat Das Geburtsdatum des Patienten
     * @param krankenKasse Die Krankenkasse des Patienten
     */
    public Patient(String name, String adresse, String gebDat, String krankenKasse) {
        this.name = name;
        this.adresse = adresse;
        this.gebDat = gebDat;
        this.krankenKasse = krankenKasse;
    }
    /**
     * @return Der Name des Patienten
     */
    public String gibName() {
        return name;
    }
    /**
     * @return Die Krankenkasse des Patienten
     */
    public String gibKrankenKasse() {
        return krankenKasse;
    }
    /**
     * @return Das Geburtsdatum des Patienten
     */
    public String gibGeburtsdatum() {
        return gebDat;
    }
    /**
     * @return Die Adresse des 
     */
    public String gibAdresse() {
        return adresse;
    }
}
