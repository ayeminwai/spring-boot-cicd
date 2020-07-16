package com.amw.java.springbootcicd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.amw.java.springbootcicd.controller.req.MainReqAPI;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootCicdApplicationTests extends MockMvcCall {
	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	void contextLoads() throws Exception {
		RESOURCE_URL = "/main/message";
		MainReqAPI request = new MainReqAPI("ayeminwai");
		String requestJson = mapper.writeValueAsString(request);
		
		String msg = postCall(requestJson);

		System.out.println("Return message code is :" + msg);
	}

}
