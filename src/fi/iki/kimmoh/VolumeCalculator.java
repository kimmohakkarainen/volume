package fi.iki.kimmoh;

import java.math.BigDecimal;

/**
 * Kahden kolmion v‰liin j‰‰v‰n alueen tilavuus. Puretaan tila kolmeksi nelitahokkaaksi, jolloin laskeminen varsin suoraviivaista.
 * 
 * 
 * @author kimmo
 *
 */
public class VolumeCalculator {

	private Triangle t1;
	private Triangle t2;
	
	public static VolumeCalculator of(Triangle t1, Triangle t2) {
		VolumeCalculator calc = new VolumeCalculator();
		
		calc.t1 = t1;
		calc.t2 = t2;
		
		return calc;
	}
	
	
	public BigDecimal calculateVolume() {

		/*
		 * pisteiden A1, A2, A3 ja B2 viritt‰m‰ nelitahokas
		 */
		
		BigDecimal vol1 = Tetrahedron.of(t1.getP1(), t1.getP2(), t1.getP3(), t2.getP2()).calculateVolume();

		
		/*
		 * Pisteiden B1, B2, B3, ja A1 viritt‰m‰ nelitahokas
		 */
		
		BigDecimal vol2 = Tetrahedron.of(t2.getP1(), t2.getP2(), t2.getP3(), t1.getP1()).calculateVolume();

		
		/*
		 * Pisteiden A1, A3, B2 ja B3 viritt‰m‰ nelitahokas
		 * 
		 */

		BigDecimal vol3 = Tetrahedron.of(t1.getP1(), t1.getP3(), t2.getP2(), t2.getP3()).calculateVolume();

		return vol1.add(vol2).add(vol3);
	}
	
	
}
