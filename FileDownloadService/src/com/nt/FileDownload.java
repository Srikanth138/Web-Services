package com.nt;

//import java.io.File;  
import javax.ws.rs.GET;
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.core.Response.ResponseBuilder;  

@Path("/files")  
public class FileDownload {  
   private static final String FILE_PATH = "e:\\myfile.txt";  
    
    @GET 
    @Path("/txt")  
    @Produces("text/plain")  
    public Response getFile() {  
    	System.out.println("hello");
        File file = new File(FILE_PATH);  
   
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"Srikanth_file.txt\"");  
        return response.build();  
   
    }  
 }  
