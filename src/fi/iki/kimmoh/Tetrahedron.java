package fi.iki.kimmoh;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tetrahedron {
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public static Tetrahedron of(Point a, Point b, Point c, Point d) {
		Tetrahedron th = new Tetrahedron();
		th.a = a;
		th.b = b;
		th.c = c;
		th.d = d;
		
		return th;
	}
	
	/**
	 * Tetrahedron volume calculation as described in 
	 * <code>https://keisan.casio.com/exec/system/1223609147</code>
	 * 
	 * 
	 * @return volume in <code>BigDecimal</code>
	 */
	
	public BigDecimal calculateVolume() {
		
		BigDecimal f1 = d.getX().subtract(a.getX());

		BigDecimal f2 = b.getY().subtract(a.getY());
		
		BigDecimal f3 = c.getZ().subtract(a.getZ());

		BigDecimal f4 = b.getZ().subtract(a.getZ());

		BigDecimal f5 = c.getY().subtract(a.getY());
		
		BigDecimal firstComponent = f1.multiply( f2.multiply(f3).subtract(f4.multiply(f5)));
		

		BigDecimal s1 = d.getY().subtract(a.getY());

		BigDecimal s2 = b.getZ().subtract(a.getZ());
		
		BigDecimal s3 = c.getX().subtract(a.getX());

		BigDecimal s4 = b.getX().subtract(a.getX());

		BigDecimal s5 = c.getZ().subtract(a.getZ());

		
		BigDecimal secondComponent = s1.multiply(s2.multiply(s3).subtract(s4.multiply(s5)));
		

		
		BigDecimal t1 = d.getZ().subtract(a.getZ());

		BigDecimal t2 = b.getX().subtract(a.getX());
		
		BigDecimal t3 = c.getY().subtract(a.getY());

		BigDecimal t4 = b.getY().subtract(a.getY());

		BigDecimal t5 = c.getX().subtract(a.getX());


		BigDecimal thirdComponent = t1.multiply(t2.multiply(t3).subtract(t4.multiply(t5)));
		
		BigDecimal volume = firstComponent.add(secondComponent).add(thirdComponent).divide(BigDecimal.valueOf(6),3, RoundingMode.HALF_UP).abs();

		return volume;
	}
	
}
