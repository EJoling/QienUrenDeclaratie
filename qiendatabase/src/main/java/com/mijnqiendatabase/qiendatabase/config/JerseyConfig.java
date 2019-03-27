package com.mijnqiendatabase.qiendatabase.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		//register(PersoonApi.class); --> commando voor aanroepen Api
	}
}
