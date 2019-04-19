package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/msg")
public class Message{
	@GET
	@Path("/show")
	@Produces("application/json")
    public Employee show() {
		Employee e= new Employee();
		     e.setEmpId(10);
		     e.setEmpName("Sonu");
		     e.setEmpSal(222.67);
	    return e;
	}
}
