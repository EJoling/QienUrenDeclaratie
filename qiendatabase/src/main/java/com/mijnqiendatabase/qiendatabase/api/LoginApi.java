package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Kostensoort;
import com.mijnqiendatabase.qiendatabase.domain.User;
import com.mijnqiendatabase.qiendatabase.service.KostensoortService;
import com.mijnqiendatabase.qiendatabase.service.UserService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("login")
public class LoginApi {
	@Autowired
	private UserService userService;
	

	@POST // Update
  	public Response apiLogin(User user) {
         	System.out.println("check in apilogin");
         	return Response.ok(userService.findByLogin(user.getUsername(), user.getWachtwoord())).build();
  	}
 

}
