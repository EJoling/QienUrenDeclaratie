package com.mijnqiendatabase.qiendatabase.api;

import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.Dag;
import com.mijnqiendatabase.qiendatabase.service.DagService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("dag")
public class DagApi {

	@Autowired
	private DagService dagService;

	@POST // Create
	public Response apiCreate(Dag dag) {
		if (dag.getId() != 0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(dagService.save(dag)).build();
	}

	@GET // Retrieve/Read
	@Path("{id}")
	public Response apiGetById(@PathParam("id") long id) {
		Optional<Dag> dag = dagService.findById(id);
		if (dag.isPresent() == false) {
			return Response.status(Response.Status.NOT_FOUND).build();
		} else {
			return Response.ok(dag.get()).build();
		}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(dagService.findAll()).build();
  	}
 
  	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Dag dag) {
         	if (dag == null || dag.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Dag> oldDag = dagService.findById(dag.getId());
         	if (!oldDag.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(dagService.save(dag)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (dagService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
         		dagService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}

}
