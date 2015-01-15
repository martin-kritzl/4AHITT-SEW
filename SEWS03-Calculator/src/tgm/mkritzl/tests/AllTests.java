package tgm.mkritzl.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculator.class, TestDivision.class,
		TestMultiplication.class, TestSubstraction.class,
		TestAddition.class})

/**Fuehrt alle Tests aus
 * 
 * @author Martin Kritzl
 * @version 20141112
 *
 */
public class AllTests {
	/**Startet alle Tests
	 * 
	 * @param args
	 * @version 20141112
	 */
	public static void main(String[] args) {
		JUnitCore.main("tgm.mkritzl.tests.AllTests");
	}
}
