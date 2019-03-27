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

import com.mijnqiendatabase.qiendatabase.domain.Admin;
import com.mijnqiendatabase.qiendatabase.service.AdminService;;

@Path("admin")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class AdminApi {

	@Autowired
	private AdminService adminService;

	@POST // Create
	public Response apiCreate(Admin admin) {
		if (admin.getId() != 0) {
			return Response.status(Response.Status.CONFLICT).build();
		}
		return Response.ok(adminService.save(admin)).build();
	}

	@GET // Retrieve/Read
	@Path("{id}")
	public Response apiGetById(@PathParam("id") long id) {
		Optional<Admin> admin = adminService.findById(id);
		if (admin.isPresent() == false) {
			return Response.status(Response.Status.NOT_FOUND).build();
		} else {
			return Response.ok(admin.get()).build();
		}
	}
	
	@GET // Retrieve/Read
  	public Response apiGetAll() {
         	return Response.ok(adminService.findAll()).build();
  	}
 
  	@PUT // Update
  	@Path("{id}")
  	public Response apiUpdate(@PathParam("id") long id, Admin admin) {
         	if (admin == null || admin.getId() != id)
               	return Response.status(Response.Status.BAD_REQUEST).build();
 
         	Optional<Admin> oldAdmin = adminService.findById(admin.getId());
         	if (!oldAdmin.isPresent()) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	}
         	return Response.ok(adminService.save(admin)).build();
  	}
 
  	@DELETE // Delete
  	@Path("{id}")
  	public Response apiDeleteById(@PathParam("id") long id) {
         	if (adminService.findById(id).isPresent() == false) {
               	return Response.status(Response.Status.NOT_FOUND).build();
         	} else {
                adminService.deleteById(id);
               	return Response.status(Response.Status.OK).build();
         	}
  	}

}