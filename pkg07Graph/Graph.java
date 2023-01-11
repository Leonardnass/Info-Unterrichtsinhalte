package pkg07Graph;

public class Graph {
    private Knoten[] knotenliste;
    private int[][] matrix;
    private int maxAnzahl, anzahl;

    public Graph(int max) {
        maxAnzahl = max;
        knotenliste = new Knoten[maxAnzahl];
        matrix = new int[maxAnzahl][maxAnzahl];
        for (int i = 0; i < maxAnzahl; i++)
            for (int j = 0; j < maxAnzahl; j++)
                if (i != j)
                    matrix[i][j] = -1;
    }

    public void knotenEinfuegen(Datenelement neu) {
        if (anzahl < maxAnzahl) {
            knotenliste[anzahl] = new Knoten(neu);
            anzahl++;
        }
    }

    public void kanteEinfuegen(int start, int ziel, int gewichtung) {
        if (start != ziel && start >= 0 && ziel >= 0 && start < maxAnzahl && ziel < maxAnzahl)
            matrix[start][ziel] = gewichtung;
    }

    public void kanteEntfernen(int start, int ziel) {
        if (start != ziel && start >= 0 && ziel >= 0 && start < maxAnzahl && ziel < maxAnzahl)
            matrix[start][ziel] = -1;
    }

    public void knotenlisteAusgeben() {
        for (int i = 0; i < anzahl; i++) {
            knotenliste[i].gibDaten().datenAusgeben();
        }
    }

    public void matrixAusgeben() {
        for (int i = 0; i < anzahl; i++) {
            System.out.print(knotenliste[i].gibDaten().nameGeben().substring(0, 2));
            for (int j = 0; j < anzahl; j++) {
                System.out.printf(" | %3d", matrix[i][j]);
            }
            System.out.println(" |");
        }
    }

    /**
     * Sucht nach einem String innerhalb der knotenliste.
     * 
     * @param suche Der zu suchende String
     * @return Der Index oder -1, falls der String nicht gefunden wurde
     */
    public int knotenIndexSuchen(String suche) {
        for (int i = 0; i < anzahl; i++)
            if (knotenliste[i].gibDaten().istGleich(suche))
                return i;
        return -1;
    }

    public Datenelement entfernen(int index) {
        if (index >= anzahl || index < 0) {
            return null;
        }
        anzahl--;

        for (int i = 0; i < anzahl; i++) {
            matrix[index][i] = matrix[anzahl][i];
            matrix[anzahl][i] = -1;
            matrix[i][index] = matrix[i][anzahl];
            matrix[i][anzahl] = -1;
        }
        matrix[index][index] = 0;
        matrix[anzahl][anzahl] = 0;
        knotenliste[index] = knotenliste[anzahl];
        try {
            return knotenliste[anzahl].gibDaten();
        } finally {
            knotenliste[anzahl] = null;
        }


    }

    public Datenelement entfernen(String vergleich) {
        return entfernen(knotenIndexSuchen(vergleich));
    }

    public void starteTiefensuche(int startKnoten) {
        if (startKnoten < 0 || startKnoten >= anzahl) {
            return;
        }
        for (int i = 0; i < anzahl; i++) {
            knotenliste[i].markierung = false;
        }
        tiefensuche(startKnoten);

    }

    private void tiefensuche(int startKnoten) {
        System.out.println(knotenliste[startKnoten].gibDaten().nameGeben());
        knotenliste[startKnoten].markierung = true;
        for (int i = 0; i < anzahl; i++) {
            if ((matrix[startKnoten][i] > 0) && (!knotenliste[i].markierung)) {
                tiefensuche(i);
            }
        }
    }
}
