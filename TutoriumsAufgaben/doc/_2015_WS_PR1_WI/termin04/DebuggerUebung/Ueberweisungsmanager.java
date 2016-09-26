/**
 * Diese Klasse beschreibt einen Service, 
 * welcher es erlaubt Geld von einem Konto auf ein anderes zu uebertragen.
 * 
 * @author Lenno
 */
public class Ueberweisungsmanager {
    
    /**
     * Diese Methode ermoeglicht es einen Geldbetrag von einem,
     * zu einem anderen Konto zu uebertragen.
     * Der Geldbetrag muss zuerst vom Quellkonto abgezogen,
     * und anschließend zum Zielkonto eingezahlt werden.
     * 
     * @param quellKonto das Konto von welchem Geld abgehoben werden soll.
     * @param zielKonto das Konto, auf welches das Geld eingezahlt werden soll.
     * @param betrag der zu uebertragende Geldbetrag.
     * @return true wenn die Ueberweisung erfolgreich war, false wenn nicht.
     */
    public boolean ueberweisen(Konto quellKonto, Konto zielKonto, int betrag) {
        if(betrag > 0) {
            quellKonto.abziehen(betrag);
            zielKonto.einzahlen(betrag);
            return true;
        }
        return false;
    }
}