package com.mijnqiendatabase.qiendatabase.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mijnqiendatabase.qiendatabase.api.AdminApi;
import com.mijnqiendatabase.qiendatabase.api.DagApi;
import com.mijnqiendatabase.qiendatabase.api.KlantApi;
import com.mijnqiendatabase.qiendatabase.api.KostenApi;
import com.mijnqiendatabase.qiendatabase.api.KostensoortApi;
import com.mijnqiendatabase.qiendatabase.api.TijdsformulierApi;
import com.mijnqiendatabase.qiendatabase.api.TraineeApi;
import com.mijnqiendatabase.qiendatabase.api.UurApi;
import com.mijnqiendatabase.qiendatabase.api.UursoortApi;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(KostenApi.class); // commando voor aanroepen Api
		register(KostensoortApi.class);
		register(AdminApi.class);
		register(DagApi.class);
		register(KlantApi.class);
		register(TijdsformulierApi.class);
		register(TraineeApi.class);
		register(UurApi.class);
		register(UursoortApi.class);
	}
}
