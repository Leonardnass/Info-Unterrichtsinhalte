package pkg07Graph;

public class Main {
    public static void main(String[] args) {
        testen();
    }

    public static void testen() {
        Graph g = new Graph(10);

        g.knotenEinfuegen(new Ortschaft("München", 10000, "Oktoberfest"));
        g.knotenEinfuegen(new Ortschaft("Fürstenfeldbruck", 200, "Kloster"));
        g.knotenEinfuegen(new Ortschaft("Germering", 150, "Parsberg, Stadthalle"));
        g.knotenEinfuegen(new Ortschaft("Olching", 100, "Vogelpark, Kartpalast"));
        g.knotenEinfuegen(new Ortschaft("Inning", 500, "Ammersee, Wörthsee"));
        g.knotenEinfuegen(new Ortschaft("Starnberg", 600, "Roseninsel, Starnberger See"));
        g.knotenEinfuegen(new Ortschaft("Dachau", 300, "Schloss, KZ-Gedenkstätte"));
        g.knotenEinfuegen(new Ortschaft("Augsburg", 1000, "Augsburger Puppenkiste"));
        g.knotenEinfuegen(new Ortschaft("Landsberg", 2000, "Bayertor, Mutterturm, Wildpark"));
        g.knotenEinfuegen(new Ortschaft("Garching", 1000, "Maibaum, TU München"));
        g.knotenEinfuegen(new Ortschaft("Herrsching", 90, "Kloster Andechs, Ammersee, Pilsensee"));

        g.kanteEinfuegen(2, 0, 20);
        g.kanteEinfuegen(2, 5, 20);
        g.kanteEinfuegen(2, 4, 20);
        g.kanteEinfuegen(2, 1, 12);
        g.kanteEinfuegen(2, 3, 11);
        g.kanteEinfuegen(3, 2, 8);
        g.kanteEinfuegen(2, 6, 25);
        g.kanteEinfuegen(4, 0, 70);
        g.kanteEinfuegen(1, 3, 11);
        g.kanteEinfuegen(1, 4, 15);
        g.kanteEinfuegen(1, 9, 30);
        g.kanteEinfuegen(1, 7, 52);
        g.kanteEinfuegen(8, 7, 65);
        g.kanteEinfuegen(8, 4, 20);
        g.kanteEinfuegen(3, 7, 51);
        g.kanteEinfuegen(3, 6, 12);
        g.kanteEinfuegen(9, 6, 17);
        g.kanteEinfuegen(9, 0, 15);
        g.kanteEinfuegen(5, 0, 27);
        g.kanteEinfuegen(5, 10, 20);
        g.kanteEinfuegen(4, 10, 12);

        g.kanteEinfuegen(0, 2, 20);
        g.kanteEinfuegen(5, 2, 20);
        g.kanteEinfuegen(4, 2, 20);
        g.kanteEinfuegen(1, 2, 12);
        g.kanteEinfuegen(3, 2, 11);
        g.kanteEinfuegen(2, 3, 8);
        g.kanteEinfuegen(6, 2, 25);
        g.kanteEinfuegen(0, 4, 70);
        g.kanteEinfuegen(3, 1, 11);
        g.kanteEinfuegen(4, 1, 15);
        g.kanteEinfuegen(9, 1, 30);
        g.kanteEinfuegen(7, 1, 52);
        g.kanteEinfuegen(7, 8, 65);
        g.kanteEinfuegen(4, 8, 20);
        g.kanteEinfuegen(7, 3, 51);
        g.kanteEinfuegen(6, 3, 12);
        g.kanteEinfuegen(6, 9, 17);
        g.kanteEinfuegen(0, 9, 15);
        g.kanteEinfuegen(0, 5, 27);
        g.kanteEinfuegen(10, 5, 20);
        g.kanteEinfuegen(10, 4, 12);

        /*
         * g.knotenlisteAusgeben(); g.matrixAusgeben();
         * 
         * System.out.println(g.entfernen(0)); System.out.println(g.entfernen(0));
         * System.out.println(g.entfernen(0));
         * 
         * g.knotenlisteAusgeben(); g.matrixAusgeben();
         */
        System.out.println(g.knotenIndexSuchen("Dachau"));
        g.starteTiefensuche(0);
    }
}
