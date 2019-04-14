package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Klant;
import com.mijnqiendatabase.qiendatabase.service.KlantService;;

@Path("klant")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class KlantApi {

	@Autowired
	private KlantService klantService;

	@POST // Create
	public Response apiCreate(Klant klant) {
		if (klant.getId() != 0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(klantService.save(klant)).build();
		
	}

	@GET // Retrieve/Read
	@Path("{id}")
	public Response apiGetById(@PathParam("id") long id) {
		Optional<Klant> klant = klantService.findById(id);
		if (klant.isPresent() == false) {
			return Response.status(Response.Status.NOT_FOUND).build();
		} else {
			return Response.ok(klant.get()).build();
		}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(klantService.findAll()).build();
  	}
 
  	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Klant klant) {
         	if (klant == null || klant.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Klant> oldKlant = klantService.findById(klant.getId());
         	if (!oldKlant.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(klantService.save(klant)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (klantService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
               	klantService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}

}