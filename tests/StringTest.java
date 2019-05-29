import static org.junit.Assert.*;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;


import strings.Characters;

public class StringTest {

	Characters character;
	
	@Before
	public void setUp() {
		character = new Characters();
	}
	
	@Test
	public void shouldReturnDuzinaStringaWhenPassString() {
		int result = character.stringLength("string");
		assertEquals(6,result);
	}
	
	@Test
	public void shouldReturnCharsAtEvenIndexWhenPassString() {
		String result = character.atEvenIndex("abc");
		assertEquals("ac", result);
	}
	
	@Test
	public void shouldReturnCharsAtOddIndexWhenPassString() {
		String result = character.atOddIndex("abc");
		assertEquals("b", result);
	}
	
	@Test
	public void shouldReturnNumberOfUpperCasesWhenPassString() {
		int result = character.numberOfUpperCase("abc");
		assertEquals(0, result);
	}
	
	@Test
	public void shouldReturnNumberOfLowercasesKarakteraWhenPassString() {
		int result = character.numberOfLowerCase("abc");
		assertEquals(3,result);
	}
	
	@Test
	public void shouldReturnNotCharsWhenPassString() {
		String result = character.notChars("a!");
		assertEquals("!",result);
	}
}



