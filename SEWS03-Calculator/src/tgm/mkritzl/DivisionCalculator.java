package tgm.mkritzl;
import java.util.LinkedList;
import java.util.List;

/**Dividiert jedes Element der uebergebenen Liste mit dem Modifier und gibt diese neue Liste zurueck
 * 
 * @author Martin Kritzl
 * @version 20141112
 */
public class DivisionCalculator implements CalcBehavior {

	/**Dividiert jedes Element der uebergebenen Liste mit dem Modifier und gibt diese neue Liste zurueck
	 * 
	 * @param Liste der Zahlen, Modifier
	 * @return berechnete Liste
	 * @version 20141112
	 */
	public List<Double> calc(List<Double> list, double modifier) {
		List<Double> newList = new LinkedList<Double>();
		for(double element:list) {
			newList.add(element/modifier);
		}
		return newList;
	}

}
