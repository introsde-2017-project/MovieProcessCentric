package introsde.project.process.movie.rest.resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import introsde.project.process.movie.rest.model.BusinessService;


@Path("/types")
public class TypeResource {
	
	@Path("/m")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getMovieGens(){
         
        return Response.ok(BusinessService.getMovieGens()).build();
    }
	

}
