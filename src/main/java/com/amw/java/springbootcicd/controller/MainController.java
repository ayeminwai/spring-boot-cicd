package com.amw.java.springbootcicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amw.java.springbootcicd.controller.res.MainResAPI;

@RestController
@RequestMapping(value = "/main")
public class MainController {

	@PostMapping(value = "/message")
	public ResponseEntity<MainResAPI> getMessage() {
		MainResAPI res = new MainResAPI();
		res.getSuccessResponse();
		return new ResponseEntity<MainResAPI>(res, HttpStatus.OK);
	}
}
