package com.takipi.oss.storage.resources.diag;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/storage/v1/diag/ping")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class PingStorageResource {
	private static final Logger logger = LoggerFactory.getLogger(PingStorageResource.class);
	
	@GET
	public Response get() {
		try {
			return Response.ok("ok").build();
		} catch (Exception e) {
			logger.error("Could not reply to ping request", e);
			return Response.serverError().entity("Could not reply to ping request").build();
		}
	}
}
