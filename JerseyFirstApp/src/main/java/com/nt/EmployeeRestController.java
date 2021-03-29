package com.nt;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/*POST : To create new resource at Producer App
PUT  : To modify existed resource at Producer App*/

@Path("/employee")
public class EmployeeRestController {

	@GET
	@Path("/select")
	public String getMsg() {
		return "WELCOME TO FIRST REST APP!";
	}
	@POST
	@Path("/insert")
	public String insertMsg() {
		return "INSERT FIRST REST APP!";
	}
	@PUT
	@Path("/update")
//	http://localhost:3036/JerseyFirstApp/rest/employee/update
	public String updateMsg() {
		return "UPDATE TO FIRST REST APP!";
	}
	@DELETE
	@Path("/remove")
	public String removeMsg() {
		return "DELETE TO FIRST REST APP!";
	}
}