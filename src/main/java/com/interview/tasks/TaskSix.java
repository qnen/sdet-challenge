package com.interview.tasks;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class TaskSix {

	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = "http://api.giphy.com/v1/gifs";
	}

	@Test
	public void TaskSix() {
		RestAssured.given().queryParam("q", "funny dog").queryParam("api_key", "dc6zaTOxFJmzC")
			.when()
				.get("/search");
		
		// I'm getting {statusCode: 403; msg: BANNED} for this API... Evidence:
		// https://prnt.sc/E5yIMkAcT_RR

	}
}
