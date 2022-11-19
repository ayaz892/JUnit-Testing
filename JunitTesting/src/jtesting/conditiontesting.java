package jtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class conditiontesting {

	@Test
	void test() {
		Condition  c1=new Condition();
		int output1=c1.checktype(10); //valid 
		assertEquals(20, output1);
		
		int output2=c1.checktype(10); //invalid
		assertEquals(15, output2);
		
		
		int output3=c1.checktype(-5); //valid
		assertEquals(-15, output3);
		
		int output4=c1.checktype(-5); //invalid
		assertEquals(-50, output4);
		
		int output5=c1.checktype(0); //valid
		assertEquals(100, output5);
		
		int output6=c1.checktype(0); //invalid
		assertEquals(500, output6);
		
	}

}
