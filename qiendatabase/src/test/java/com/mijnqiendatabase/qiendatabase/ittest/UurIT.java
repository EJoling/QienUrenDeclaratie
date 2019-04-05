package com.mijnqiendatabase.qiendatabase.ittest;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.mijnqiendatabase.qiendatabase.api.UurApi;
import com.mijnqiendatabase.qiendatabase.domain.Uur;
import com.mijnqiendatabase.qiendatabase.service.UurService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UurIT {
	
	@Autowired
    private UurApi uurapi;
	
	 @Test
	    public void testCreate() {

	        // Arrange
	        Uur uur = new Uur();
	        uur.setWaarde("werken");


	        // Act
	        this.uurapi.apiCreate(uur);


	        // Assert
	        Response response = this.uurapi.apiGetAll();
	        Iterable<Uur> uurLijst = (Iterable<Uur>) response.getEntity();

	        int size = 0;
	        for(Uur element: uurLijst) {
	            size++;
	            Assert.assertEquals(element.getWaarde(), "werken");
	        }

	        Assert.assertEquals(1, size);

	 }
}
