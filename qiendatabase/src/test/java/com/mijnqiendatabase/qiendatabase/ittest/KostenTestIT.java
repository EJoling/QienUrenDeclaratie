package com.mijnqiendatabase.qiendatabase.ittest;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mijnqiendatabase.qiendatabase.api.KostenApi;
import com.mijnqiendatabase.qiendatabase.domain.Kosten;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KostenTestIT {
	
	@Autowired
	private KostenApi kostenapi;
	
	@Test
	public void testSave() {
		// Arrange
		Kosten kosten = new Kosten();
		kosten.setAantalKM(8);
		// Act
		this.kostenapi.apiCreate(kosten);
		// Assert
		Response response = this.kostenapi.apiGetAll();
		Iterable<Kosten> Kostenlijst = (Iterable<Kosten>) response.getEntity();
		int size = 0;
		for (Kosten element : Kostenlijst) {
			size++;
			Assert.assertEquals(element.getAantalKM(), 8);
		}//end for
		Assert.assertEquals(1, size);
	}//end testSave
	
	@Test
	public void testGetById() {
		// Arrange
		Kosten kosten = new Kosten();
		// Act
		this.kostenapi.apiCreate(kosten);
		// Assert
		Response response = this.kostenapi.apiGetAll();
		Iterable<Kosten> Kostenlijst = (Iterable<Kosten>) response.getEntity();
		int size = 0;
		for (Kosten element : Kostenlijst) {
			size++;
		}//end for
		Assert.assertEquals(1, size);
	}//end testGetById
	
	
}//end KostenTestIt
