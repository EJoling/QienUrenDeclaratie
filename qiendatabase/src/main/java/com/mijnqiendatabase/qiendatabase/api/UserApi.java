package com.mijnqiendatabase.qiendatabase.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.domain.User;
import com.mijnqiendatabase.qiendatabase.service.UserService;;

@Path("trein")
@Component
public class UserApi {

//	@Autowired
//	private TreinService treinService;
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response listGroep() {
//		Iterable<Trein> treinen = treinService.findAll();
//		return Response.ok(treinen).build();
//	}
//
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response postTrein(Trein trein) {
//		Trein result = treinService.save(trein);
//		return Response.accepted(result.getId()).build();
//	}

}