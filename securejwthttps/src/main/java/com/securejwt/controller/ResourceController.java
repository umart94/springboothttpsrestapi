package com.securejwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@Api("resource controller")
@RestController
public class ResourceController {
	
	@ApiOperation(value = "hellouser", notes="hellouser",authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/hellouser"})
	public String helloUser(){
		return "Hello User";
	}
	
	
	@ApiOperation(value = "helloadmin", notes="helloadmin",authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/helloadmin"})
	public String helloAdmin(){
		return "Hello Admin";
	}

}
