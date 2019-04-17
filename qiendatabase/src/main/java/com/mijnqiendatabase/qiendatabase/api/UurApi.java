package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Uur;
import com.mijnqiendatabase.qiendatabase.service.UurService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("uur")
public class UurApi {
	@Autowired
	private UurService uurService;

	@POST // Create
	public Response apiCreate(Uur uur) {
		if (uur.getId() != 0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(uurService.save(uur)).build();
	}

	@GET // Retrieve/Read
	@Path("{id}")
	public Response apiGetById(@PathParam("id") long id) {
		Optional<Uur> uur = uurService.findById(id);
		if (uur.isPresent() == false) {
			return Response.status(Response.Status.NOT_FOUND).build();
		} else {
			return Response.ok(uur.get()).build();
		}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
		System.out.println("tralala");
         	return Response.ok(uurService.findAll()).build();
  	}
	
	
 
  	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Uur uur) {
         	if (uur == null || uur.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Uur> oldUur = uurService.findById(id);
         	if (!oldUur.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	Uur target = oldUur.get();
         	target.setAccordStatus(uur.getAccordStatus());
         	target.setAantal(uur.getAantal());
         	target.setFactuurDatum(uur.getFactuurDatum());
         	target.setWaarde(uur.getWaarde());
         	System.out.println("check in uur algemeen");
         	return Response.ok(uurService.save(target)).build();
  	}
  	
  	@PUT // Update akkoord
  	@Path("{id}/akkoordstatus")
  	public Response apiUpdateAkkoord(@PathParam("id") long id, Uur uur) {
  		System.out.println("lalalalalala");
     	if (uur == null)
           	return Response.status(Response.Status.BAD_REQUEST).build();

     	Optional<Uur> oldUur = uurService.findById(id);
     	if (!oldUur.isPresent()) {
           	return Response.status(Response.Status.NOT_FOUND).build();
     	}
     	Uur target = oldUur.get();
     	target.setAccordStatus(uur.getAccordStatus());
     	System.out.println("check in uur");
     	return Response.ok(uurService.save(target)).build();
	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (uurService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		uurService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}

}
