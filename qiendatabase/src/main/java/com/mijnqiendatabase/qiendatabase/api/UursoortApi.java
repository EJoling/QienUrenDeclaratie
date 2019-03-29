package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Uursoort;
import com.mijnqiendatabase.qiendatabase.service.UursoortService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("uursoort")
public class UursoortApi {
	
	@Autowired
	private UursoortService uursoortService;

	@POST // Create
	public Response apiCreate(Uursoort uursoort) {
		if (uursoort.getId() != 0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(uursoortService.save(uursoort)).build();
	}

	@GET // Retrieve/Read
	@Path("{id}")
	public Response apiGetById(@PathParam("id") long id) {
		Optional<Uursoort> uursoort = uursoortService.findById(id);
		if (uursoort.isPresent() == false) {
			return Response.status(Response.Status.NOT_FOUND).build();
		} else {
			return Response.ok(uursoort.get()).build();
		}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(uursoortService.findAll()).build();
  	}
 
  	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Uursoort uursoort) {
         	if (uursoort == null || uursoort.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Uursoort> oldUursoort = uursoortService.findById(uursoort.getId());
         	if (!oldUursoort.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(uursoortService.save(uursoort)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (uursoortService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		uursoortService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}
}
