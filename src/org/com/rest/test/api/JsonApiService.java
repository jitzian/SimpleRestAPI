package org.com.rest.test.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/apiTest")
public class JsonApiService {

	public JsonApiService() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Path("{f}")
	@Produces("application/json")
	public Response getJsonResponse(@PathParam("f")float f){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Original f", f);
		f += 1;
		jsonObject.put("Added f", f);
		
		String strResponse = String.valueOf(f) + jsonObject;
		
		return Response.status(200).entity(strResponse).build();
	}

}
