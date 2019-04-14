package com.mijnqiendatabase.qiendatabase.ittest;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.mijnqiendatabase.qiendatabase.domain.Declaratieformulier;


import com.mijnqiendatabase.qiendatabase.api.DeclaratieformulierApi;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeclaratieformulierIT {
	
	@Autowired
	private DeclaratieformulierApi declaratieformulierApi;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCreate() {
		
		//Arrange
		Declaratieformulier newOne = new Declaratieformulier();
		newOne.setTest("Tim");
		
		//Act
		this.declaratieformulierApi.apiCreate(newOne);
		
		//Assert
		Response response = this.declaratieformulierApi.apiGetAll();
		
		Object oBody = response.getEntity();
		Iterable<Declaratieformulier> decs = (Iterable<Declaratieformulier>) oBody;
		
		for(Declaratieformulier element: decs) {
            Assert.assertEquals("Tim", element.getTest());
		}

	}
}
