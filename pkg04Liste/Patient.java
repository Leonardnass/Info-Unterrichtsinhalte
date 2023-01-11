package pkg00basis;

public class Patient {
    private String name, adresse, gebDat, krankenKasse;
    
    public Patient() {
        name = "John Doe";
        adresse = "Weg";
        gebDat = "2000-01-01";
        krankenKasse = "";
    }
    public Patient(String name, String adresse, String gebDat, String krankenKasse) {
        this.name = name;
        this.adresse = adresse;
        this.gebDat = gebDat;
        this.krankenKasse = krankenKasse;
    }
    public String gibName() {
        return name;
    }
    public String gibKrankenKasse() {
        return krankenKasse;
    }
    public String gibGeburtsdatum() {
        return gebDat;
    }
    public String gibAdresse() {
        return adresse;
    }
}
