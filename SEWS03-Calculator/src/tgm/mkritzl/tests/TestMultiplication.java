package tgm.mkritzl.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import tgm.mkritzl.Calculator;
import tgm.mkritzl.MultiplicationCalculator;

/**Testet die Klasse MultiplicationCalculator
 * 
 * @author Martin Kritzl
 * @version 20141112
 *
 */
public class TestMultiplication {
	
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
	public void multiplication1() {
		calc.setCalc(new MultiplicationCalculator());
		List<Double> temp = calc.calcList();
		assertEquals(17.92, temp.get(0), 0.000001);
		assertEquals(0.0, temp.get(1), 0.000001);
		assertEquals(15.36, temp.get(2), 0.000001);
	}
	
	/**
	 * Berechnung mit einem Modifier gleich 0 und positiven Zahlen
	 */
	@Test
	public void multiplication2() {
		calc.setCalc(new MultiplicationCalculator());
		calc.setModifier(0);
		List<Double> temp = calc.calcList();
		assertEquals(0, temp.get(0), 0.000001);
		assertEquals(0, temp.get(1), 0.000001);
		assertEquals(0, temp.get(2), 0.000001);
	}
	
	/**
	 * Berechnung mit einem positiven Modifier und negativen Zahlen
	 */
	@Test
	public void negMultiplication1() {
		calc.setCalc(new MultiplicationCalculator());
		List<Double> temp = calc.calcList();
		assertEquals(-17.92, temp.get(3), 0.000001);
		assertEquals(0.0, temp.get(4), 0.000001);
		assertEquals(-15.36, temp.get(5), 0.000001);
	}
	
	/**
	 * Berechnung mit einem negativen Modifier und negativen Zahlen
	 */
	@Test
	public void negMultiplication2() {
		calc.setCalc(new MultiplicationCalculator());
		calc.setModifier(-3.2);
		List<Double> temp = calc.calcList();
		assertEquals(17.92, temp.get(3), 0.000001);
		assertEquals(0.0, temp.get(4), 0.000001);
		assertEquals(15.36, temp.get(5), 0.000001);
	}

}
