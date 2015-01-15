package tgm.mkritzl.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import tgm.mkritzl.Calculator;
import tgm.mkritzl.DivisionCalculator;
import tgm.mkritzl.MultiplicationCalculator;

/**Testet die Klasse DivisionCalculator
 * 
 * @author Martin Kritzl
 * @version 20141112
 *
 */
public class TestDivision {

	private Calculator calc;

	/**
	 * Erstellen eines Calculators, setzen des Modifiers und ein paar Zahlen
	 */
	@Before
	public void before() {
		calc = new Calculator(new MultiplicationCalculator());
		calc.setModifier(3.2);
		calc.addValue(5.6);
		calc.addValue(0);
		calc.addValue(4.8);
		calc.addValue(-5.6);
		calc.addValue(-0);
		calc.addValue(-4.8);
	}
	
	/**
	 * Berechnung mit einem positiven Modifier und positiven Zahlen
	 */
	@Test
	public void division1() {
		calc.setCalc(new DivisionCalculator());
		List<Double> temp = calc.calcList();
		assertEquals(1.75, temp.get(0), 0.000001);
		assertEquals(0, temp.get(1), 0.000001);
		assertEquals(1.5, temp.get(2), 0.000001);
	}
	
	/**
	 * Berechnung mit einem Modifier gleich 0 und positiven Zahlen
	 */
	@Test
	public void division2() {
		calc.setCalc(new DivisionCalculator());
		calc.setModifier(0);
		List<Double> temp = calc.calcList();
		assertEquals(new Double("Infinity"), temp.get(0));
		assertEquals(new Double("NaN"), temp.get(1));
		assertEquals(new Double("Infinity"), temp.get(2));
	}
	
	/**
	 * Berechnung mit einem positiven Modifier und negativen Zahlen
	 */
	@Test
	public void negDivision1() {
		calc.setCalc(new DivisionCalculator());
		calc.setModifier(3.2);
		List<Double> temp = calc.calcList();
		assertEquals(-1.75, temp.get(3), 0.000001);
		assertEquals(0, temp.get(4), 0.000001);
		assertEquals(-1.5, temp.get(5), 0.000001);
	}
	
	/**
	 * Berechnung mit einem negativen Modifier und negativen Zahlen
	 */
	@Test
	public void negDivision2() {
		calc.setCalc(new DivisionCalculator());
		calc.setModifier(-3.2);
		List<Double> temp = calc.calcList();
		assertEquals(1.75, temp.get(3), 0.000001);
		assertEquals(0, temp.get(4), 0.000001);
		assertEquals(1.5, temp.get(5), 0.000001);
	}

}
