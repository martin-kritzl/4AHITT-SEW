/**Stellt ein Kraftfahrzeug dar
 * 
 * @author Martin Kritzl
 * @version 20141015
 */
public class Kraftfahrzeug extends Fahrzeug{
	private short leistung;
	private double verbrauch;
	
	/**Erzeugt ein Kraftfahrzeug
	 * 
	 * @param baujahr
	 * @param preis in Euro.Cent
	 * @param leistung in PS
	 * @param verbrauch in Liter
	 */
	public Kraftfahrzeug(int baujahr, double preis, short leistung, double verbrauch) {
		super(baujahr, preis);
		this.leistung = leistung;
		this.verbrauch = verbrauch;
	}
	
	/**
	 * 
	 * @return Leistung in PS
	 */
	public short getLeistung() {
		return leistung;
	}
	
	/**
	 * 
	 * @return Leistung in Watt
	 */
	public int getWatt() {
		return this.leistung * 735;
	}
	
	/**
	 * 
	 * @param Leistung in PS
	 */
	public void setLeistung(short leistung) {
		this.leistung = leistung;
	}
	
	/**
	 * 
	 * @return Verbrauch in Liter
	 */
	public double getVerbrauch() {
		return verbrauch;
	}
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}
	
	
	/*
	 * Überladen von Methoden
	 */
	
	/*
	 * Es existieren zwei Methoden mit gleichem Namen, deren Parameter sind aber unterschiedlich.
	 * Durch die Unterschiede der Parameter, dazu gehört die Anzahl und der Datentyp, können beide
	 * Methoden parallel bestehen
	 */
	
	/**Bildet mit dem Namen einen Satz
	 * 
	 * @param name einer Person
	 * @return Einen Satz
	 */
	public String fahren(String name) {
		return name + " fährt mit dem Fahrzeug";
	}
	
	/**Bildet einen Satz mit den beiden Namen
	 * 
	 * @param name1 einer Person
	 * @param name2 einer Person
	 * @return Einen Satz
	 */
	public String fahren(String name1, String name2) {
		return name1 + " und " + name2 + " fahren mit dem Fahrzeug";
	}
}
