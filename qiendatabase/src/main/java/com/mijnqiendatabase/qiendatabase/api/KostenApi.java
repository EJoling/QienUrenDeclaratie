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
	private KostenService kostenService;
	
	@POST//create
	public Response apiCreate(Kosten kosten) {
		if(kosten.getId() !=0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(kostenService.save(kosten)).build();
	}
	
	@GET //Retrieve/read
	@Path("{id}")
	public Response apiGetById(@PathParam("id")long id) {
		Optional<Kosten> kosten = kostenService.findById(id);
		if (kosten.isPresent() == false) {
           	return Response.status(Response.Status.NOT_FOUND).build();
     	} else {
           	return Response.ok(kosten.get()).build();
     	}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(kostenService.findAll()).build();
  	}
	
	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Kosten kosten) {
         	if (kosten == null || kosten.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Kosten> oldKosten = kostenService.findById(kosten.getId());
         	if (!oldKosten.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(kostenService.save(kosten)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (kostenService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		kostenService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}
}
