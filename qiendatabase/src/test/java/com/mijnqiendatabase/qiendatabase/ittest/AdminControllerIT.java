package com.mijnqiendatabase.qiendatabase.ittest;

import com.mijnqiendatabase.qiendatabase.api.AdminApi;
import com.mijnqiendatabase.qiendatabase.domain.Admin;
import com.mijnqiendatabase.qiendatabase.domain.Admin;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminControllerIT {


    @Autowired
    private AdminApi adminApi;


    @Test
    public void testCreate() {

        // Arrange
        Admin newOne = new Admin();
        newOne.setVoornaam("Pacman");


        // Act
        this.adminApi.apiCreate(newOne); //???


        // Assert
        Response resp = adminApi.apiGetAll();
        Object oBody = resp.getEntity();
        Iterable<Admin> admins = (Iterable<Admin>) oBody;
        
        int count = 0;
        
        for(Admin a : admins) {
        		count++;
        }
        
//        Iterable<Motorbike> lijst = response.getBody();
//
//        int size = 0;
//        for(Motorbike element: lijst) {
//            size++;
//        }

        Assert.assertEquals(1, count);
//        Assert.assertNotEquals(0, count);
    }
}