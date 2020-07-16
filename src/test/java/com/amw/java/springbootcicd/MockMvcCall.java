package com.amw.java.springbootcicd;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

public class MockMvcCall {
	protected MockMvc mockMvc;

	protected static final String CONTENT_TYPE = "application/json;charset=UTF-8";

	protected static String RESOURCE_URL = "";
    
	public String postCall(String requestJSON) throws Exception {

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Content-Type", CONTENT_TYPE);
		
	    ResultActions result
		= mockMvc.perform(post(RESOURCE_URL).contentType(CONTENT_TYPE)
		.headers(httpHeaders)
		.content(requestJSON)
		)
		//.andExpect(content().contentType(CONTENT_TYPE))
		.andExpect(jsonPath("$.code").value("000"));
		
		String resultString = result.andReturn().getResponse().getContentAsString();

		return resultString;
		//JacksonJsonParser jsonParser = new JacksonJsonParser();
		//return jsonParser.parseMap(resultString).get("code").toString();
	}
	
}
