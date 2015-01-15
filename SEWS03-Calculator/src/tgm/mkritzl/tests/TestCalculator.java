package tgm.mkritzl.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import tgm.mkritzl.AdditionCalculator;
import tgm.mkritzl.Calculator;

/**Testet die Klasse Calculator
 * 
 * @author Martin Kritzl
 * @version 20141112
 *
 */
public class TestCalculator {

	private Calculator calc;

	/**
	 * Erstellen eines Calculators, setzen des Modifiers und ein paar Zahlen
	 */
	@Before
	public void before() {
		calc = new Calculator(new AdditionCalculator());
		calc.setModifier(1);
		calc.addValue(5.6);
		calc.addValue(4.8);
		calc.addValue(-5.6);
		calc.addValue(-4.8);
	}
	
	/**
	 * Setzt einen positiven Modifier
	 */
	@Test
	public void setModifier() {
		calc.setModifier(5.2);
		assertEquals(5.2, calc.getModifier(), 0.000001);
	}
	
	/**
	 * Setzt einen negativen Modifier
	 */
	@Test
	public void setNegModifier() {
		calc.setModifier(-5.2);
		assertEquals(-5.2, calc.getModifier(), 0.000001);
	}
	
	/**
	 * Ueberprueft die Rueckgabe der toString Methode
	 */
	@Test
	public void listToString() {
		assertEquals("5.6, 4.8, -5.6, -4.8", calc.toString());
	}
	
	/**
	 * Fuegt eine positive Zahl der Liste hinzu
	 */
	@Test
	public void addValue2() {
		calc.addValue(4.8);
		assertEquals(4.8, calc.getList().get(calc.getList().size()-1), 0.000001);
	}
	
	/**
	 * Fuegt eine negative Zahl der Liste hinzu
	 */
	@Test
	public void addNegValue() {
		calc.addValue(-4.8);
		assertEquals(-4.8, calc.getList().get(calc.getList().size()-1), 0.000001);
	}
	
	/**
	 * Loescht eine positive Zahl, die oefters vorhanden ist
	 */
	@Test
	public void removeValue() {
		calc.addValue(5.6);
		calc.addValue(5.6);
		calc.removeValue(5.6);
		assertEquals(-4.8, calc.getList().get(calc.getList().size()-1), 0.000001);
	}
	
	/**
	 * Loescht eine negative Zahl, die oefters vorhanden ist
	 */
	@Test
	public void removeNegValue() {
		calc.addValue(-5.6);
		calc.addValue(-5.6);
		calc.removeValue(-5.6);
		assertEquals(-4.8, calc.getList().get(calc.getList().size()-1), 0.000001);
	}
	
	/**
	 * Setzt die Berechnungsart neu und ueberprueft mittels instanceof
	 */
	@Test
	public void setCalc() {
		calc.setCalc(new AdditionCalculator());
		assertEquals(true, calc.getCalc() instanceof AdditionCalculator);
	}
	
	/**
	 * Fuehrt eine Berechnung durch
	 */
	@Test
	public void calcList() {
		calc.setCalc(new AdditionCalculator());
		assertEquals("[6.6, 5.8, -4.6, -3.8]", calc.calcList().toString());
	}
}
