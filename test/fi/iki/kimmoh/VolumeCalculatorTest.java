package fi.iki.kimmoh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

class VolumeCalculatorTest {

	@Test
	void testCase1() {
		
		
		Triangle t1 = Triangle.of("[0,0,0]","[1,0,0]","[0,1,0]");

		Triangle t2 = Triangle.of("[0,0,4]","[1,0,4]","[0,1,4]");
		
		assertEquals(new BigDecimal("2.0"), VolumeCalculator.of(t1, t2).calculateVolume().setScale(1, RoundingMode.HALF_UP));

	}

	
	/*
	 * Origon siirto ei saa vaikuttaa laskentaan
	 */
	
	@Test
	void testCase5() {
		
		
		Triangle t1 = Triangle.of("[50,0,0]","[51,0,0]","[50,1,0]");

		Triangle t2 = Triangle.of("[50,0,4]","[51,0,4]","[50,1,4]");
		
		assertEquals(new BigDecimal("2.0"), VolumeCalculator.of(t1, t2).calculateVolume().setScale(1, RoundingMode.HALF_UP));

	}

	
	
	@Test
	void testCase3() {
		
		
		Triangle t1 = Triangle.of("[0,0,0]","[1,0,0]","[0,1,0]");

		Triangle t2 = Triangle.of("[0,0,4]","[1,0,4]","[0,1,4]");
		
		assertEquals(new BigDecimal("2.0"), VolumeCalculator.of(t1, t2).calculateVolume().setScale(1, RoundingMode.HALF_UP));

	}

	
}
