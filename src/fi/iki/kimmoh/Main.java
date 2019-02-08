package fi.iki.kimmoh;

public class Main {

	/*
	 * 	Create a method in Java which calculates the volume between these two triangles:
	 * 
	 *	[25492673.593,6678072.773,4.615], [25492719.473,6678050.171,6.968],[25492697.753,6678048.506,6.492]
	 *	[25492673.593,6678072.773,5.415], [25492719.473,6678050.171,8.168],[25492697.753,6678048.506,7.392]
	 *
	 */


	private static String [] TRIANGLE1 = {
			"[25492673.593,6678072.773,4.615]", 
			"[25492719.473,6678050.171,6.968]",
			"[25492697.753,6678048.506,6.492]"
	};

	private static String [] TRIANGLE2 = {
			"[25492673.593,6678072.773,5.415]",
			"[25492719.473,6678050.171,8.168]",
			"[25492697.753,6678048.506,7.392]"
	};


	public static void main(String ... args) {
		
		Triangle t1 = Triangle.of(TRIANGLE1);

		Triangle t2 = Triangle.of(TRIANGLE2);

		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("\nKolmioiden välinen tilavuus " + VolumeCalculator.of(t1, t2).calculateVolume());
		
		

	}
}
