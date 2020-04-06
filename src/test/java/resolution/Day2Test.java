package resolution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import resolution.Day2.Paquet;

public class Day2Test {


	@Test
	public void feetOfRibbonNeeded() {

		Day2.Paquet paquet1=new Paquet("2x3x4");
		Day2.Paquet paquet2=new Paquet("1x1x10");

		assertEquals(34, paquet1.getRibbonNeeded());

		assertEquals(14, paquet2.getRibbonNeeded());
	}

	@Test
	public void paquetSurfaceCas1() {

		Day2.Paquet paquet=new Paquet("2x3x4");

		assertEquals(58, paquet.getSurfacePaperNeeded());

	}


	@Test
	public void paquetSurfaceCas2() {

		Day2.Paquet paquet=new Paquet("1x1x10");

		assertEquals(43, paquet.getSurfacePaperNeeded());

	}
}
