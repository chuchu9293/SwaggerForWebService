package com.likeyichu.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("book")
@Api(value="hehe")
public class Book {
	public String name = "Physics";
	@GET
	@ApiOperation(value = "Finds Pets by status",
    notes = "Multiple status values can be provided with comma seperated strings",
    response = Book.class,
    responseContainer = "List")
	@Produces(MediaType.APPLICATION_JSON)
	public Book wsBook(){
		return new Book();
	}
}