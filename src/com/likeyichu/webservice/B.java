package com.likeyichu.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("dunit.json")
public class B {

	
	public static String ss="{\"apiVersion\": \"0.0.4542.22887\",\"swaggerVersion\": \"1.0\",\"basePath\": \"http://local.api.com/api/doc\",\"apis\": [{\"path\": \"/donuts\",\"description\": \"Operations about donuts\"}]}";
	@GET
	public String wsString(){
		return ss;
	}
}
