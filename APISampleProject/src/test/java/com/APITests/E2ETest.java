package com.APITests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.JsonPathUtility;
import com.base.Base;

import io.restassured.path.json.JsonPath;


public class E2ETest extends Base {
	@Test
	public void GetSingleUserRegisterLogin(){
		//given details
		String response =given().header("Content-Type","application/json").
	
		// get method with resource
		when().get("api/users/2").
		// Assertion
		then().assertThat().statusCode(200).
		// log response in console
		log().all().
		// verify response content type
		header("Content-Type", "application/json; charset=utf-8").
		//Extract response as string
		extract().response().asString();
		// get EMail address from the response
		JsonPath js= JsonPathUtility.convertjson(response);
		String emailAddress = js.getString("data.email");
		
		// Register End point
	String responses =	given().header("Content-Type","application/json")
//			pass email address in body 
		.body("{\n"
				+ "    \"email\": \""+emailAddress+"\",\n"
				+ "    \"password\": \"pistol\"\n"
				+ "}").
		when().post("api/register").
		then().assertThat().statusCode(200).log().all().
		extract().response().asString();
		JsonPath js1= JsonPathUtility.convertjson(responses);
		String Registertoken = js1.getString("token");
		System.out.println(Registertoken);
		
		
		// Login End point
		given().header("Content-Type","application/json")
				.body("{\n"
						+ "    \"email\": \""+emailAddress+"\",\n"
						+ "    \"password\": \"pistol\"\n"
						+ "}").
				when().post("api/login").
				then().assertThat().statusCode(200).log().all().
				extract().response().asString();
				JsonPath js2= JsonPathUtility.convertjson(responses);
				String Logintoken = js2.getString("token");
				System.out.println(Logintoken);
			
				// Verify Register token and Login Token
		AssertJUnit.assertEquals(Registertoken, Logintoken);
		
		
	}

}
