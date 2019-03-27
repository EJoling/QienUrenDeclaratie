package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Kostensoort;

import com.mijnqiendatabase.qiendatabase.service.KostensoortService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("kostensoort")
public class KostensoortApi {
	
	@Autowired
	private KostensoortService kostensoortservice;
	
	@POST//create
	public Response apiCreate(Kostensoort kostensoort) {
		if(kostensoort.getId() !=0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(kostensoortservice.save(kostensoort)).build();
	}
	
	@GET //Retrieve/read
	@Path("{id}")
	public Response apiGetById(@PathParam("id")long id) {
		Optional<Kostensoort> kosten = kostensoortservice.findById(id);
		if (kosten.isPresent() == false) {
           	return Response.status(Response.Status.NOT_FOUND).build();
     	} else {
           	return Response.ok(kosten.get()).build();
     	}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(kostensoortservice.findAll()).build();
  	}
	
	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Kostensoort kostensoort) {
         	if (kostensoort == null || kostensoort.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Kostensoort> oudDeclForm = kostensoortservice.findById(kostensoort.getId());
         	if (!oudDeclForm.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(kostensoortservice.save(kostensoort)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (kostensoortservice.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		kostensoortservice.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}
}
