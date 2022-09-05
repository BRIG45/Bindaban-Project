package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewHelloController {

	@RequestMapping("/hello")
	public String returnControllerhello() {
		return "Hello World!";
	}
	@RequestMapping("/hello/name")
	public String returnControllername() {
		return "My Name is Brindaban Garai";
	}
	@RequestMapping("/hello/name/address")
	public String returnControlleraddress() {
		return "Adventz Infinity @5, 18th floor,BN Block,Sector V,"
				+ "Bidhannagar,Kolkata, West Bengal 700091 ";
	}
}