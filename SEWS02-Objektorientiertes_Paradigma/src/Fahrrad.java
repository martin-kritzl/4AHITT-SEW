/**Stellt ein Fahrrad dar
 * 
 * @author Martin Kritzl
 * @version 20141015
 */
public class Fahrrad extends Fahrzeug{
	private int anzSpeichen;
	
	/**Erzeugt ein Fahrrad
	 * 
	 * @param baujahr
	 * @param preis in Euro.Cent
	 * @param anzSpeichen
	 */
	public Fahrrad(int baujahr, double preis, int anzSpeichen) {
		super(baujahr, preis);
		this.anzSpeichen = anzSpeichen;
	}
	
	/**
	 * @return Anzahl der Speichen
	 */
	public int getAnzSpeichen() {
		return anzSpeichen;
	}
	
	/**
	 * @param anzSpeichen
	 */
	public void setAnzSpeichen(int anzSpeichen) {
		this.anzSpeichen = anzSpeichen;
	}
}
