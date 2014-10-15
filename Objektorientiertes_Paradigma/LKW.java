/**Stellt einen LKW dar
 * 
 * @author Martin Kritzl
 * @version 20141015
 */
public class LKW extends Kraftfahrzeug{
	private String zuladung;
	
	/**Erzeugt einen LKW
	 * 
	 * @param baujahr
	 * @param preis in Euro.Cent
	 * @param leistung in PS
	 * @param verbrauch in Liter
	 * @param zuladung
	 */
	public LKW(int baujahr, double preis, short leistung, double verbrauch, String zuladung) {
		super(baujahr, preis, leistung, verbrauch);
		this.zuladung = zuladung;
	}
	
	/**
	 * @return Art der Zuladung
	 */
	public String getZuladung() {
		return zuladung;
	}
	
	/**
	 * 
	 * @param Art derZuladung
	 */
	public void setZuladung(String zuladung) {
		this.zuladung = zuladung;
	}
	
	/**Bildet mit dem Namen einen Satz
	 * 
	 * @param name einer Person
	 * @return Einen Satz
	 */
	public String fahren(String name) {
		return name + " liefert Materialen bei der Baustelle ab";
	}
}
