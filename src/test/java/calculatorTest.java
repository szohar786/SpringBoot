package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.calculator;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class calculatorTest {
	
	@Test
	private void test() {
		calculator cs = new calculator();
		
		Assertions.assertEquals(cs.add(), 120);
		Assertions.assertEquals(cs.subtract(), 40);
		Assertions.assertEquals(cs.multiple(), 3200);
		Assertions.assertEquals(cs.division(), 2);
		Assertions.assertEquals(cs.modularDivision(), 0);
	}

}
