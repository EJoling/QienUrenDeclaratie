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

import com.mijnqiendatabase.qiendatabase.domain.Trainee;
import com.mijnqiendatabase.qiendatabase.service.TraineeService;;

@Path("trainee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class TraineeApi {

	@Autowired
	private TraineeService traineeService;

	@POST // Create
	public Response apiCreate(Trainee trainee) {
		if (trainee.getId() != 0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(traineeService.save(trainee)).build();
	}

	@GET // Retrieve/Read
	@Path("{id}")
	public Response apiGetById(@PathParam("id") long id) {
		Optional<Trainee> trainee = traineeService.findById(id);
		if (trainee.isPresent() == false) {
			return Response.status(Response.Status.NOT_FOUND).build();
		} else {
			return Response.ok(trainee.get()).build();
		}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(traineeService.findAll()).build();
  	}
 
  	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Trainee trainee) {
         	if (trainee == null || trainee.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Trainee> oldTrainee = traineeService.findById(trainee.getId());
         	if (!oldTrainee.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(traineeService.save(trainee)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (traineeService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
               	traineeService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}

}