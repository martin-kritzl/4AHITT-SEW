
/**Stellt ein Fahrzeug dar
 * 
 * @author Martin Kritzl
 * @version 20141015
 */

public class Fahrzeug {
	private int baujahr;
	private double preis;
	
	/**Erzeugt ein Fahrzeug
	 * 
	 * @param baujahr
	 * @param preis in Euro.Cent
	 */
	public Fahrzeug(int baujahr, double preis) {
		this.baujahr = baujahr;
		this.preis = preis;
	}
	
	/** 
	 * @return Baujahr
	 */
	public int getBaujahr() {
		return baujahr;
	}
	
	/**
	 * @param Baujahr
	 */
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
	/**
	 * @return Preis
	 */
	public double getPreis() {
		return preis;
	}
	
	/**
	 * @param Preis
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	/**
	 * 
	 * @return Preis ohne Cent
	 */
	public int getPreisEuro() {
		return (int) preis;
	}
}
