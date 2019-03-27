package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Kosten;
import com.mijnqiendatabase.qiendatabase.service.KostenService;


@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("kosten")
public class KostenApi {
	@Autowired
	private KostenService kostenservice;
	
	@POST//create
	public Response apiCreate(Kosten kosten) {
		if(kosten.getId() !=0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(kostenservice.save(kosten)).build();
	}
	
	@GET //Retrieve/read
	@Path("{id}")
	public Response apiGetById(@PathParam("id")long id) {
		Optional<Kosten> kosten = kostenservice.findById(id);
		if (kosten.isPresent() == false) {
           	return Response.status(Response.Status.NOT_FOUND).build();
     	} else {
           	return Response.ok(kosten.get()).build();
     	}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(kostenservice.findAll()).build();
  	}
	
	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Kosten kosten) {
         	if (kosten == null || kosten.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Kosten> oudDeclForm = kostenservice.findById(kosten.getId());
         	if (!oudDeclForm.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(kostenservice.save(kosten)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (kostenservice.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		kostenservice.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}
}
