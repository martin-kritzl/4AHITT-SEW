/**Speichert eine Nummer die einen Datentyp hat, der von Number erbt
 * 
 * @author Martin Kritzl
 * @version 20141015
 * @param <T> Eine Nummer die einen Datentyp hat, der von Number erbt
 */
public class SaveNumber<T extends Number> {
	private T number;
	
	/**Erzeugt ein neues Objekt von SaveNumber
	 * 
	 * @param number
	 */
	public SaveNumber(T number) {
		this.number = number;
	}
	
	/**Gibt die Nummer zurueck
	 * 
	 * @return number
	 */
	public T getNumber() {
		return this.number;
	}
	
	/**Setzt die Nummer
	 * 
	 * @param number
	 */
	public void setNumber(T number) {
		this.number = number;
	}
}
