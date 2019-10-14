package com.api.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

@RunWith(SerenityRunner.class)
public class FirstSerenitTest {
	
	
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://reqres.in/api";
	}
	
	@Test
	public void getAllRes() {
		SerenityRest.given().
		when().
		get("/users?page=2").
		then().
		log().
		all().
		statusCode(200);
	}

}
