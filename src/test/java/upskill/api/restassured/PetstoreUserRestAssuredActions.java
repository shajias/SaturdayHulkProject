package upskill.api.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;


public class PetstoreUserRestAssuredActions {
	
	public void createUser() {

		given(). // Request Payload
				body(new File(System.getProperty("user.dir")// give you the path to SaturdayHulk Project
							+ "/src/test/resource/ApiRequestPayloads/CreateUserRequest.json")).
				
				// it gives you the path to the request payload.
				when(). // Setting the Header & Request url
				header("Content-Type", "application/json").// the content-type in this file is a json file.
															
				post("https://petstore.swagger.io/v2/user").// do the post method
															// onto this url.
				then(). // Printing Response in console
				log().body().// it will print out my response body.
				and(). // Verify status code
				assertThat().statusCode(200).// then we are asserting the status
												// code. it will validate the
												// status code.
				and(). // Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir")
						+ "/src/test/resource/ApiResponseSchemas/CreateUserResponse.json")));
	}

	public void updateUser() {

		given(). // Request Payload
				body(new File(System.getProperty("user.dir")
						+ "/src/test/resource/ApiRequestPayloads/UpdateUserRequest.json"))
				.
				// it gives you the path to the request payload.
				when(). // Setting the Header & Request url
				header("Content-Type", "application/json").
				put("https://petstore.swagger.io/v2/user/Shajias").
															
				then(). // Printing Response in console
				log().body().// it will print out my response body.
				and(). // Verify status code
				assertThat().statusCode(200).
				and(). // Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir")
						+ "/src/test/resource/ApiResponseSchemas/UpdateUserResponse.json")));
	}

public void getUser(){
		
		given().														//Request Payload
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			header("bearer_token", "dfvhk42687rfehdvfj2368749ruvrv44f4kyj").		//Auth
			header("username", "upskill").
			header("password", "12345").
			header("AccessKey", "upskill").											//AWS
			header("SecretKey", "mhgcht47ituykuh6457gyiutf356g").
			header("AWS Region", "us-east").
			header("Service Name", "S3").
			header("Session Token", "kulgyyrdty8745hkjhfc876756").
			get("https://petstore.swagger.io/v2/user/Shajias").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/GetUserResponse.json")));
	}


	public void deleteUser() {
		given(). // Request Payload

				when(). // Setting the Header & Request url
				header("Content-Type", "application/json").// the content-type
															// in this file is a
															// json file.
				delete("https://petstore.swagger.io/v2/user/Shajias").// do the post
																// method onto
																// this url.
				then(). // Printing Response in console
				log().body().// it will print out my response body.
				and(). // Verify status code
				assertThat().statusCode(200).// then we are asserting the status
												// code. it will validate the
												// status code.
				and(). // Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir")
						+ "/src/test/resource/ApiResponseSchemas/DeleteUserResponse.json")));
	}

}


