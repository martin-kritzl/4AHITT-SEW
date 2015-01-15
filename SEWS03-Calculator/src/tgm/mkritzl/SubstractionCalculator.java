package tgm.mkritzl;
import java.util.LinkedList;
import java.util.List;

/**Subtrahiert von jedem Element der uebergebenen Liste den Modifier und gibt diese neue Liste zurueck
 * 
 * @author Martin Kritzl
 * @version 20141112
 */
public class SubstractionCalculator implements CalcBehavior {

	/**Subtrahiert von jedem Element der uebergebenen Liste den Modifier und gibt diese neue Liste zurueck
	 * 
	 * @param Liste der Zahlen, Modifier
	 * @return berechnete Liste
	 * @version 20141112
	 */
	public List<Double> calc(List<Double> list, double modifier) {
		List<Double> newList = new LinkedList<Double>();
		for(double element:list) {
			newList.add(element-modifier);
		}
		return newList;
	}

}
