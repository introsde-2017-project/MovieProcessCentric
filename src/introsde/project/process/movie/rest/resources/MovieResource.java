package introsde.project.process.movie.rest.resources;


import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import introsde.project.data.local.soap.Person;
import introsde.project.process.movie.rest.model.BusinessService;

@Path("/secure")
public class MovieResource {
	
	//get 5 food recommendation for a user
	 @Path("/recom/m/{quantity}")
	    @GET
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	    public Response getMovieRec(@Context HttpHeaders headers,@PathParam("quantity") int quantity){
	    	try {
	        	System.out.println("getting all user feedbacks");
	        	
	        	String authString = headers.getRequestHeader("authorization").get(0);
	        	String token = authString.substring("Bearer".length()).trim();
	        	
	        	Person u=getAuthenticationToken(token);
	        	if(!token.equals(u.getToken()))
	        		throw new Exception();
	        	return Response.ok(BusinessService.getMovieRecom(u,quantity)).build();
	    	}
	    	catch (Exception e){
	    		return Response.status(Response.Status.UNAUTHORIZED).build();
	    	}
	    }
	    
	 
	  //adding a new person in local, food recombee and movie recombee DATABASE
	    @Path("/get/myratings/m")
	    @GET
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
	    public Response getfoodRatings(@Context HttpHeaders headers) {
	    	try {
	        	System.out.println("getting all user feedbacks");
	        	
	        	String authString = headers.getRequestHeader("authorization").get(0);
	        	String token = authString.substring("Bearer".length()).trim();
	        	
	        	Person u=getAuthenticationToken(token);
	        	if(!token.equals(u.getToken()))
	        		throw new Exception();
	        	return Response.ok(BusinessService.getUserRatings(u)).build();
	    	}
	    	catch (Exception e){
	    		return Response.status(Response.Status.UNAUTHORIZED).build();
	    	}
	    }
	    
	    @Path("/add/rating/m/{itemId}/{rating}")
	    @PUT
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	    public Response addFoodRatings(@Context HttpHeaders headers,@PathParam("itemId") String itemId,@PathParam("rating") int rating) {
	    	try {
	        	System.out.println("adding feedback " +(double) (rating-3)/2);
	        	
	        	String authString = headers.getRequestHeader("authorization").get(0);
	        	String token = authString.substring("Bearer".length()).trim();
	        	
	        	Person u=getAuthenticationToken(token);
	        	if(!token.equals(u.getToken()))
	        		throw new Exception();
	        	if(!BusinessService.addUserRatings(u,((double) (rating-3)/2),itemId)) {
	        		return Response.status(Response.Status.METHOD_NOT_ALLOWED).build();
	        	}
	        	return Response.ok().build();
	        	
	    	}
	    	catch (Exception e){
	    		return Response.status(Response.Status.BAD_REQUEST).build();
	    	}
	    }
	    
	    @Path("/getbytype/m/{movieGen}")
	    @GET
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	    public Response getFoodByType(@Context HttpHeaders headers, @PathParam("movieGen") String movieGen){
	    	try {
	        	System.out.println("search Food by given Types: ");
	        	
	        	String authString = headers.getRequestHeader("authorization").get(0);
	        	String token = authString.substring("Bearer".length()).trim();
	        	
	        	Person u=getAuthenticationToken(token);
	        	if(!token.equals(u.getToken()))
	        		throw new Exception();
	        	return Response.ok(BusinessService.getMovieByGen(movieGen)).build();
	    	}
	    	catch (Exception e){
	    		return Response.status(Response.Status.UNAUTHORIZED).build();
	    	}
	    }
	    
	    private Person getAuthenticationToken(String token) throws Exception {
			Person u=BusinessService.getPersonByToken(token);
	    	if(u == null) 
	    		throw new Exception();
	    	return u;
		}

}
