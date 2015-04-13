package com.likeyichu.webservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("swagger.json")
public class A {

	
	public static String ss="{\"apiVersion\": \"0.0.4542.22887\",\"swaggerVersion\": \"1.0\",\"basePath\": \"http://local.api.com/api/doc\",\"apis\": [{\"path\": \"/donuts\",\"description\": \"Operations about donuts\"}]}";
	@GET
	public String wsString() throws FileNotFoundException{
		Scanner scanner=new Scanner(new File("d:/a1.txt"));
		StringBuilder sb=new StringBuilder();
		while(scanner.hasNextLine()){
			sb.append(scanner.nextLine());
		}
		return sb.toString();
	}
}
