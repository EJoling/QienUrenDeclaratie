package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Declaratieformulier;
import com.mijnqiendatabase.qiendatabase.service.DeclaratieformulierService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("declaratieformulier")
public class DeclaratieformulierApi {
	
	@Autowired
	private DeclaratieformulierService declaratieformulierService;
	
	@POST//create
	public Response apiCreate(Declaratieformulier declform) {
		if(declform.getId() !=0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(declaratieformulierService.save(declform)).build();
	}
	
	@GET //Retrieve/read
	@Path("{id}")
	public Response apiGetById(@PathParam("id")long id) {
		Optional<Declaratieformulier> declaratieformulier = declaratieformulierService.findById(id);
		if (declaratieformulier.isPresent() == false) {
           	return Response.status(Response.Status.NOT_FOUND).build();
     	} else {
           	return Response.ok(declaratieformulier.get()).build();
     	}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(declaratieformulierService.findAll()).build();
  	}
	
	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Declaratieformulier declform) {
         	if (declform == null || declform.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Declaratieformulier> oldDeclForm = declaratieformulierService.findById(declform.getId());
         	if (!oldDeclForm.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(declaratieformulierService.save(declform)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (declaratieformulierService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		declaratieformulierService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}


}
