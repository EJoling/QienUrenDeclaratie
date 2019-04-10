package com.mijnqiendatabase.qiendatabase.domain;

import org.junit.Assert;
import org.junit.Test;



public class DeclaratieformulierTest {
	
	private Declaratieformulier declaratieformulier = new Declaratieformulier();
	
	@Test
	public void testGetAndSetFortest() {
		
		this.declaratieformulier.setTest("WelDus");
		
		Assert.assertEquals("NietDus", this.declaratieformulier.getTest());
		
	}

}
