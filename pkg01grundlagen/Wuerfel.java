package pkg01grundlagen;

public class Wuerfel {
    int zahl;
    Kreis[] kreis;
    Rechteck rechteck;

    /**
     * Erstellt einen Wuerfel an den angegebenen Koordinaten.
     * Der Wuerfel ist 280px hoch und 280px breit.
     * @param x x-Koordinate linker Rand
     * @param y y-Koordinate oberer Rand
     */
    public Wuerfel(int x, int y) {
        rechteck = new Rechteck(x, y, 280, 280);
        rechteck.setzeFarbe("weiss");
        kreis = new Kreis[7];
        for (int i = 0; i < kreis.length; i++) {
            kreis[i] = new Kreis(20);
            kreis[i].setzeFarbe("schwarz");
        }
        kreis[0].setzePosition(x+ 20, y+ 20);
        kreis[1].setzePosition(x+ 20, y+120);
        kreis[2].setzePosition(x+ 20, y+220);
        kreis[3].setzePosition(x+120, y+120);
        kreis[4].setzePosition(x+220, y+ 20);
        kreis[5].setzePosition(x+220, y+120);
        kreis[6].setzePosition(x+220, y+220);
        zahl=7;
    }
    public void wuerfle() {
        setzeZahl();
        zeigeAugen();
    }
    public int gibZahl() {
        return zahl;
    }
    private void setzeZahl() {
        zahl = (int)(Math.random()*6 +1);
    }
    private void zeigeAugen() {
        switch (zahl) {
            case 1: 
                kreis[0].unsichtbarMachen();
                kreis[1].unsichtbarMachen();
                kreis[2].unsichtbarMachen();
                kreis[3].sichtbarMachen();
                kreis[4].unsichtbarMachen();
                kreis[5].unsichtbarMachen();
                kreis[6].unsichtbarMachen();
                break;
            case 2: 
                kreis[0].sichtbarMachen();
                kreis[1].unsichtbarMachen();
                kreis[2].unsichtbarMachen();
                kreis[3].unsichtbarMachen();
                kreis[4].unsichtbarMachen();
                kreis[5].unsichtbarMachen();
                kreis[6].sichtbarMachen();
                break;
            case 3: 
                kreis[0].sichtbarMachen();
                kreis[1].unsichtbarMachen();
                kreis[2].unsichtbarMachen();
                kreis[3].sichtbarMachen();
                kreis[4].unsichtbarMachen();
                kreis[5].unsichtbarMachen();
                kreis[6].sichtbarMachen();
                break;
            case 4: 
                kreis[0].sichtbarMachen();
                kreis[1].unsichtbarMachen();
                kreis[2].sichtbarMachen();
                kreis[3].unsichtbarMachen();
                kreis[4].sichtbarMachen();
                kreis[5].unsichtbarMachen();
                kreis[6].sichtbarMachen();
                break;
            case 5:
                kreis[0].sichtbarMachen();
                kreis[1].unsichtbarMachen();
                kreis[2].sichtbarMachen();
                kreis[3].sichtbarMachen();
                kreis[4].sichtbarMachen();
                kreis[5].unsichtbarMachen();
                kreis[6].sichtbarMachen();
                break;
            default: 
                kreis[0].sichtbarMachen();
                kreis[1].sichtbarMachen();
                kreis[2].sichtbarMachen();
                kreis[3].unsichtbarMachen();
                kreis[4].sichtbarMachen();
                kreis[5].sichtbarMachen();
                kreis[6].sichtbarMachen();
                break;
        }
    }
}
