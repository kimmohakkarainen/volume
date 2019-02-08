package fi.iki.kimmoh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testCase1() {
		Point p = Point.of("[25492673.593,6678072.773,4.615]");

		assertEquals(new BigDecimal("25492673.593"), p.getX());
		assertEquals(new BigDecimal("6678072.773"), p.getY());
		assertEquals(new BigDecimal("4.615"), p.getZ());
	}

	@Test
	void testCase2() {
		Point p = Point.of("[25492673.593 ,	6678072.773  ,\t4.615]");

		assertEquals(new BigDecimal("25492673.593"), p.getX());
		assertEquals(new BigDecimal("6678072.773"), p.getY());
		assertEquals(new BigDecimal("4.615"), p.getZ());
	}

}
