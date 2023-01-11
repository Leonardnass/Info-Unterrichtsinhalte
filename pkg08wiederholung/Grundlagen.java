package pkg08wiederholung;


public class Grundlagen {

    public void quadratzahl(int i){
            System.out.println("Die Quadratzahl von " + i + " ist " + i*i);
    }
    public static void zahlenListe() {
        for (int i = 10; i < 37; i++) {
            System.out.print(""+i+" ");
        }
    }
    public static void quadratListe() {
        for (int i = 0; i <= 15; i++) {
            System.out.println(""+i+": "+i*i);
        }
    }
    public static void fakultaet(int n) {
        int fakultaet = 1;
        for (int i = 1; i <= n; i++) {
            fakultaet *= i;
        }
        System.out.println("Ergebnis: " + fakultaet);
    }
    /**
     * Erstellt einen Kreis mit zufaelliger Postion, Radius und Farbe
     * @return Der erstellte Kreis
     */
    public static Kreis zufallsKreis() {
        Kreis kreis = new Kreis(
            (int)(Math.random()*600), 
            (int)(Math.random()*600), 
            (int)(Math.random()*100)
        );
        String farbe;
        switch ((int)(Math.random()*6)){
            case 0:  farbe = "rot"; break;
            case 1:  farbe = "blau"; break;
            case 2:  farbe = "gelb"; break;
            case 3:  farbe = "gruen"; break;
            case 4:  farbe = "orange"; break;
            default: farbe = "lila"; break;
        }
        kreis.setzeFarbe(farbe);
        return kreis;
    }
    public static Kreis[] vieleKreise() {
        Kreis[] kreis = new Kreis[100];
        for (int i = 0; i < kreis.length; i++) {
            kreis[i] = zufallsKreis();
        }
        return kreis;
    }
    public static void vieleKreiseMitUnsichtbarMachen() {
        Kreis[] kreis;
        kreis = new Kreis[100];
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < kreis.length; i++) {
                kreis[i] = zufallsKreis();
            }
            for (int i = 0; i < kreis.length; i++) {
                kreis[i].unsichtbarMachen();
            }
        }
    }
}
