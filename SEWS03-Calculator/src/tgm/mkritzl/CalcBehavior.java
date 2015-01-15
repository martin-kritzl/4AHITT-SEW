package tgm.mkritzl;
import java.util.List;

/**Erwartet von den Implementierenden Klassen, dass diese eine Liste berechnen können
 * 
 * @author Martin Kritzl
 * @version 20141112
 */
public interface CalcBehavior{
	public List<Double> calc(List<Double> list, double modifier);
}
