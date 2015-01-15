/**Stellt einen PKW dar
 * 
 * @author Martin Kritzl
 * @version 20141015
 */
public class PKW extends Kraftfahrzeug{
	private String besitzer;
	
	/**Erzeugt einen PKW
	 * 
	 * @param baujahr
	 * @param preis in Euro.Cent
	 * @param leistung in PS
	 * @param verbrauch in Liter
	 * @param besitzer
	 */
	public PKW(int baujahr, double preis, short leistung, double verbrauch, String besitzer) {
		super(baujahr, preis, leistung, verbrauch);
		this.besitzer = besitzer;
	}
	
	/** 
	 * @return Namen des Besitzers
	 */
	public String getBesitzer() {
		return besitzer;
	}
	
	/**
	 * @param Name des Besitzer
	 */
	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}
	
	/**Bildet einen Satz mit den beiden Namen
	 * 
	 * @param name1 einer Person
	 * @param name2 einer Person
	 * @return Einen Satz
	 */
	public String fahren(String name1, String name2) {
		return name1 + " fährt mit " + name2 + " in den Urlaub";
	}
}
