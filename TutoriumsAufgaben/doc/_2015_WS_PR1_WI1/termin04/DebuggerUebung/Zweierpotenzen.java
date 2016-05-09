
/**
 * Diese Klasse bietet eine rekursive Implementation einer Methode, 
 * welche einem die Zweierpotenz zu einer gegebenen ganzahligen natürlichen Zahl zurückliefert.
 * 
 * @author Lennart Borchert
 * @version 1.0
 */
class Zweierpotenzen
{
    /**
     * Diese Methode liefert die Zweierpotenz zu einem 
     * gegebenen ganzzahligem natürlichem Exponenten zurück.
     * 
     * @param exponent der Exponent der zu berechnenden Zweierpotenz
     * @return die Zweierpotenz zu dem gegebenen Exponenten
     */
    public int zweierpotenz(int exponent) {
        return (exponent == 0) ? 1 : zweierpotenz(exponent-1)*2  ;
    }
}