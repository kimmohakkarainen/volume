package fi.iki.kimmoh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class TetrahedronTest {

	@Test
	void testVolumeCase1() {
		
		Point p1 = Point.of(0, 0, 0);

		Point p2 = Point.of(1, 0, 0);

		Point p3 = Point.of(0, 1, 0);

		Point p4 = Point.of(0, 0, 1);

		Tetrahedron th = Tetrahedron.of(p1,  p2,  p3,  p4);
		
		assertEquals(new BigDecimal("0.167"), th.calculateVolume());

	}

	
	
	@Test
	void testVolumeCase2() {
		
		Point p1 = Point.of(10, 0, 0);

		Point p2 = Point.of(1, 0, 0);

		Point p3 = Point.of(0, 1, 0);

		Point p4 = Point.of(0, 0, 1);

		Tetrahedron th = Tetrahedron.of(p1,  p2,  p3,  p4);
		
		assertEquals(new BigDecimal("1.500"), th.calculateVolume());

	}

	
	@Test
	void testVolumeCase3() {
		
		Point p1 = Point.of(10, 0, 0);

		Point p2 = Point.of(11, 0, 0);

		Point p3 = Point.of(10, 1, 0);

		Point p4 = Point.of(10, 0, 1);

		Tetrahedron th = Tetrahedron.of(p1,  p2,  p3,  p4);
		
		assertEquals(new BigDecimal("0.167"), th.calculateVolume());

	}

	
}
