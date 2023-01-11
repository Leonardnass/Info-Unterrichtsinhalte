package pkg02warteschlangen;

public class Taxi {
    String fahrer, kennzeichen;
    int nr;
    //* */, anzahlMitfahrer, sitzplätze*/;
    public Taxi(String fahrer, String kennzeichen, int nr/*, int anzahlMitfahrer, int sitzplätze*/ ) {
        this.fahrer = fahrer;
        this.kennzeichen = kennzeichen;
        this.nr = nr;
        //*this.anzahlMitfahrer = anzahlMitfahrer;
        //*this.sitzplätze = sitzplätze;
    }
    public String fahrerGeben() {
        return fahrer;
    }
    public String kennzeichenGeben(){
        return kennzeichen;
    }
    public int nrGeben(){
        return nr;
    }
    /*public int anzahlMitfahrerGeben(){
        return anzahlMitfahrer;
    }*/
    /*public int sitzplätzeGeben(){
        return sitzplätze;
    }*/
}
