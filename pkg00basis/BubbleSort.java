package pkg00basis;

/**
 * Eine Liste von Zahlen, die mithilfe von sortiereZahlen() sortiert werden kann
 */
public class BubbleSort {
    /**
     * Die zu sortierende Liste
     */
    private int[] liste;

    /** 
     * Erstellt Bubblesort mit einer leere Liste mit der angegeben Laenge
     * @param listenLaenge Die Laenge der zu sortierenden Liste
     */
    public BubbleSort(int listenLaenge) {
        liste = new int[listenLaenge];
    }
    /**
     * Erstellt Bubblesort mit der angegebenen Liste
     * @param liste Die zu sortierende Liste
     */
    public BubbleSort(int[] liste) {
        this.liste = liste;
    }
    /**
     * Setzt den Inhalt der Liste auf zufaelige Werte
     */
    public void setzeZahlen() {
        for (int i = 0; i < liste.length; i++) {
            liste[i] = (int)(Math.random() * Integer.MAX_VALUE);
        }
    }

    /**
     * Gibt den Inhalt der Liste auf die Konsole aus
     */
    public void gibAusZahlen() {
        for (int i = 0; i < liste.length; i++) {
            System.out.print(""+liste[i]+" ");
        }
        System.out.println();
    }
    /**
     * Sortiert die Liste
     */
    public void sortiereZahlen() {
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length-1; j++) {
                if (liste[j] > liste[j+1]) {
                    int temp = liste[j];
                    liste[j] = liste[j+1];
                    liste[j+1] = temp;
                }
            }
        }
    }
}
