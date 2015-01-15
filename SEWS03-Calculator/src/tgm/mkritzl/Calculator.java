package tgm.mkritzl;
import java.util.LinkedList;
import java.util.List;

/**Verwaltet eine Liste mit Double-Werten die hinzugefuegt oder geloescht werden koennen.
 * Diese Inhalte der Liste koennen dann ueber das Interface CalcBehavior veraendert/berechnet werden
 * 
 * @author Martin Kritzl
 * @version 20141112
 */
public class Calculator {

	private List<Double> values;
	private double modifier;
	private CalcBehavior calc;
	
	/**Erstellt eine neue leere Liste in der spaeter Zufallszahlen liegen und setzt die Berechnungsart auf den
	 * angegebenen Parameter
	 * 
	 * @param Berechnungsart
	 * @version 20141112
	 */
	public Calculator(CalcBehavior behavior) {
		this.values = new LinkedList<Double>();
		this.calc = behavior;
	}

	/**Berechnet die Liste mit der angegebenen Berechnungsart und dem Modifier
	 * 
	 * @return Berechnete Liste
	 * @version 20141112
	 */
	public List<Double> calcList() {
		return this.calc.calc(values, modifier);
	}
	
	/**Gibt die Liste mit den Zahlen zurueck
	 * 
	 * @return Liste der Zahlen
	 * @version 20141112
	 */
	public List<Double> getList() {
		return this.values;
	}

	/**Fuegt eine neue Zahl in der Liste ein
	 * 
	 * @param Zahl die hinzugefuegt werden soll
	 * @version 20141112
	 */
	public void addValue(double value) {
		this.values.add(value);
	}

	/**Setzt den Modiefier neu
	 * 
	 * @param Zahl die den Modifier darstellt
	 * @version 20141112
	 */
	public void setModifier(double value) {
		this.modifier = value;
	}
	
	/**Gibt den momentanen Modifier zurueck
	 * 
	 * @return Modifier
	 * @version 20141112
	 */
	public double getModifier() {
		return modifier;
	}

	/**Loescht alle Elemente der Liste die mit dem angegebenen Wert uebereinstimmen
	 * 
	 * @param Zahl die geloescht werden soll
	 * @version 20141112
	 */
	public void removeValue(double value) {
		List<Double> temp = new LinkedList<Double>();
		for(double element : this.values) {
			if (element!=value) {
				temp.add(element);
			}
		}
		this.values = temp;
	}
	
	/**Setzt die Beerchnungsart neu
	 * 
	 * @param Neue Berechnungsart
	 */
	public void setCalc(CalcBehavior behavior) {
		this.calc = behavior;
	}
	
	/**Gibt die momentan verwendete Berechnungsart zurueck
	 * 
	 * @return Brechnungsart
	 * @version 20141112
	 */
	public CalcBehavior getCalc() {
		return this.calc;
	}

	/**Gibt einen String zurueck der alle Elemente der Liste enthaelt getrennt mit ', '
	 * 
	 * @return repraesentierenden String
	 * @version 20141112
	 */
	
	@Override
	public String toString() {
		String str = "";
		for(double element : this.values) {
			if (str != "") str += ", ";
			str += element;
		}
		return str;
	}

}
