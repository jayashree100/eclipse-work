package com.bridgelab.junit.add;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestAdd {
	
	@Test
	public void testFindMax() {
		Add add = new Add();
		assertEquals(4,add.findMax(new int[] {1,2,3,4}));
		assertEquals(10,add.findMax(new int[] {1,2,3,10,6,7}));

		
	}

}
