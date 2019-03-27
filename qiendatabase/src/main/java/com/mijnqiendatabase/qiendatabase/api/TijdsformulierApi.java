package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Tijdsformulier;
import com.mijnqiendatabase.qiendatabase.service.TijdsformulierService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("tijdsformulier")
public class TijdsformulierApi {

	@Autowired
	private TijdsformulierService tijdsformulierService;
	
	@POST//create
	public Response apiCreate(Tijdsformulier tijdsformulier) {
		if(tijdsformulier.getId() !=0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(tijdsformulierService.save(tijdsformulier)).build();
	}
	
	@GET //Retrieve/read
	@Path("{id}")
	public Response apiGetById(@PathParam("id")long id) {
		Optional<Tijdsformulier> tijdsformulier = tijdsformulierService.findById(id);
		if (tijdsformulier.isPresent() == false) {
           	return Response.status(Response.Status.NOT_FOUND).build();
     	} else {
           	return Response.ok(tijdsformulier.get()).build();
     	}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(tijdsformulierService.findAll()).build();
  	}
	
	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Tijdsformulier tijdsformulier) {
         	if (tijdsformulier == null || tijdsformulier.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Tijdsformulier> oldTijdsformulier = tijdsformulierService.findById(tijdsformulier.getId());
         	if (!oldTijdsformulier.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(tijdsformulierService.save(tijdsformulier)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (tijdsformulierService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		tijdsformulierService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}
}

