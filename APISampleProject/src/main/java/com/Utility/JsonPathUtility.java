package com.Utility;

import io.restassured.path.json.JsonPath;

public class JsonPathUtility {
	
	public static JsonPath convertjson(String reponse) {
		JsonPath path =new JsonPath(reponse);
		return path;
	}

}
