package com.mijnqiendatabase.qiendatabase.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.api.AdminApi;
import com.mijnqiendatabase.qiendatabase.api.DagApi;
import com.mijnqiendatabase.qiendatabase.api.DeclaratieformulierApi;
import com.mijnqiendatabase.qiendatabase.api.KlantApi;
import com.mijnqiendatabase.qiendatabase.api.KostenApi;
import com.mijnqiendatabase.qiendatabase.api.KostensoortApi;
import com.mijnqiendatabase.qiendatabase.api.LoginApi;
//import com.mijnqiendatabase.qiendatabase.api.TijdsformulierApi;
import com.mijnqiendatabase.qiendatabase.api.TraineeApi;
import com.mijnqiendatabase.qiendatabase.api.UurApi;
import com.mijnqiendatabase.qiendatabase.api.UursoortApi;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {

		register(AdminApi.class); //--> commando voor aanroepen Api
		register(DagApi.class); //--> commando voor aanroepen Api
		register(DeclaratieformulierApi.class); //--> commando voor aanroepen Api
		register(KlantApi.class); //--> commando voor aanroepen Api
		register(LoginApi.class); //--> commando voor aanroepen Api
		register(KostenApi.class); // Jordi
		register(KostensoortApi.class); //--> commando voor aanroepen Api
//		register(UserApi.class); //--> commando voor aanroepen Api
		register(TraineeApi.class); //--> commando voor aanroepen Api
		register(UurApi.class); //--> commando voor aanroepen Api
		register(UursoortApi.class); //--> commando voor aanroepen Api
	}
}
