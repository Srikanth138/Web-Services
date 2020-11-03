package nit.ws;
/** http://localhost:3036/test1/rs/test/plain
	url-> http://localhost:3036/test1
	/rs is web.xml url & /test is class calling & /plain is method calling
 	*/

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test") //context path calling in web.xml url
public class Test {
	
	@GET
	//@GET request type 
	
	@Path("/plain") //url => http://localhost:3036/test1/rs/test
	//@Path("/name") path will call the method
	
	@Produces(MediaType.TEXT_PLAIN)
	//@Produces(MediaType.type) MIME type will display the content / Produces
	
	public String sayPlain(){
		System.out.println("plain...TEXT_PLAIN \n it's working...");
		return "hey i am working fine,you can proceed TEXT_PLAIN...";
	}
	
	@GET
	@Path("/html")
	@Consumes(MediaType.TEXT_HTML) 
	//@Consumes(MediaType.type) MIME type will display the content / Consumes
	
	public String sayHtml(){
		System.out.println("html... \n it's working...");
		return "<body>hey i am working fine,you can proceed TEXT_HTML...</body>";
	}
	
	@GET
	@Path("/xml")
	@Consumes(MediaType.TEXT_XML) 
	//@Consumes(MediaType.type) MIME type will display the content / Consumes
	
	public String sayXml(){
		System.out.println("Xml... \n it's working...");
		return "<server><cion>hey i am working fine,you can proceed TEXT_xml...</coin></server>";
	}
	

}
