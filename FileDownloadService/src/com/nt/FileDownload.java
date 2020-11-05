package com.nt;

import java.io.File;  
import javax.ws.rs.GET;
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.core.Response.ResponseBuilder;  

@Path("/files")  
public class FileDownload {  
   private static final String FILE_PATH = "e:\\Resume.pdf"; //local file location
    
    @GET 
    @Path("/txt")  
    @Produces("application/pdf")
    
//    @Produces("text/plain"): for downloading text file.
//    @Produces("image/png"): for downloading png image file.
//    @Produces("application/pdf"): for downloading PDF file.
//    @Produces("application/vnd.ms-excel"): for downloading excel file.
//    @Produces("application/msword"): for downloading ms word file.
    
    public Response getFile() {  
    	System.out.println("hello");
    	
        File file = new File(FILE_PATH); //find the file location 
   
        ResponseBuilder response = Response.ok((Object) file);   //file is here ref  type to convert object type
        response.header("Content-Disposition","attachment; filename=\"Srikanth_file.pdf\"");  
// response is reference.header("string any name","object type any name; save name->filename="\filename.pdf");
        return response.build();  //return type Response 
   
    }  
 }  
