package jtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		
		Function f1=new Function();
	int result=	f1.get_square(7);
		assertEquals(50, result);
	}

}
