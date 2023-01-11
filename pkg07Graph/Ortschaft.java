package pkg07Graph;

public class Ortschaft implements Datenelement {
    private String ortsname;
    private int uebernachtungsplaetze;
    private String sehenswuerdigkeiten;

    /**
     * @param ortsname Name des Ortes
     * @param uebernachtungsplaetze Zahl der uebernachtungsplaetze
     * @param sehenswuerdigkeit Liste der Sehenswuerdigkeiten
     */
    public Ortschaft(String ortsname, int uebernachtungsplaetze, String sehenswuerdigkeiten) {
        this.ortsname = ortsname;
        this.uebernachtungsplaetze = uebernachtungsplaetze;
        this.sehenswuerdigkeiten = sehenswuerdigkeiten;
    }

    @Override
    public boolean istGleich(String vergleich) {
        return vergleich.equals(ortsname);
    }

    @Override
    public boolean istGleich(Datenelement vergleich) {
        if (this == vergleich)
            return true;
        if (!(vergleich instanceof Ortschaft))
            return false;
        Ortschaft other = (Ortschaft) vergleich;
        if (ortsname == null) {
            if (other.ortsname != null)
                return false;
        } else if (!ortsname.equals(other.ortsname))
            return false;
        if (!sehenswuerdigkeiten.equals(other.sehenswuerdigkeiten))
            return false;
        if (uebernachtungsplaetze != other.uebernachtungsplaetze)
            return false;
        return true;
    }

    @Override
    public void datenAusgeben() {
        System.out.println("" + ortsname + " hat " + uebernachtungsplaetze
                + " Übernachtungsplätze und folgende Sehenswürdigkeiten: " + sehenswuerdigkeiten);
    }

    /**
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Ortschaft {\n\tortsname: " + ortsname + ",\n\t sehenswuerdigkeiten: "
                + sehenswuerdigkeiten + ",\n\t uebernachtungsplaetze: " + uebernachtungsplaetze
                + "\n}";
    }

    public String nameGeben() {
        return ortsname;
    }


}
