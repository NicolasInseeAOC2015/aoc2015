package resolution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Day3Test {

	@Test
	public void testNombreDeMaisonsVisitees() throws Exception {

		assertEquals(2, Day3.nombreDeMaisonsVisitees(">"));
		assertEquals(4, Day3.nombreDeMaisonsVisitees("^>v<"));
		assertEquals(2, Day3.nombreDeMaisonsVisitees("^v^v^v^v^v"));


	}

}
