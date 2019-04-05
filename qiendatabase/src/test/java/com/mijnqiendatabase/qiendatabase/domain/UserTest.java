package com.mijnqiendatabase.qiendatabase.domain;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class UserTest {
	
	private User user;
	
	public UserTest() {
		this.user = new Admin();
	}
	
	@Test
	public void testGetEnSetVanVoornaam() {
		this.user.setVoornaam("Bert");
		
		Assert.assertEquals("Bert", this.user.getVoornaam());
	}
	
	@Test
	public void testGetEnSetVanVoornaamFalse() {
		this.user.setVoornaam("Bert");
//		int i = 5;
//		assert(i == 5); wordt niet echt gebruikt
//		assertEquals("hoi", "hoi"); // kan als je de static import doet
		Assert.assertNotEquals("Goku", this.user.getVoornaam());
	}
	
	
}
