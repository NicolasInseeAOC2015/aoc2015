package resolution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class Day1Test {
	
	@Test
	public void shouldFindPosition() {
		
		String uneLigne="()())";
		int actual=Day1.trouverPosition(uneLigne);
		
		assertEquals(5, actual);
		
	}

}
