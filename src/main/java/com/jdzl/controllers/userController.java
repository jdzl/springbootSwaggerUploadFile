package com.jdzl.controllers;

import com.jdzl.models.User;
import com.jdzl.templates.TMail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.MimeMessageHelper;

@RestController
@Api(value = "users", description = "Users API")
public class userController {

	@Autowired
	private JavaMailSender javaMailSender;



	//localhost:8080/mail/1121891106?nombre=david zambrano&accountNumber=6665545&correo=00jdzl@gmail.com&url=http://linux.com&send=false


	@ApiOperation(
			value = "Get  accountNumber info",
			response = User.class,
			notes = "returns the information of an account number")
	@ApiResponses({
			@ApiResponse(code = 200, message = "returns the information of an account number"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@RequestMapping(value = "/mail/{cedula}",method = RequestMethod.GET, produces = "application/json")
	public User mail(@PathVariable String cedula,
					 @RequestParam String accountNumber,
					 @RequestParam String nombre,
					 @RequestParam String correo,
					 @RequestParam String url,
					 @RequestParam(required=false,defaultValue = "false")  boolean send) {


		if(send)
			try {
				MimeMessage mimeMessage = javaMailSender.createMimeMessage();
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
				mimeMessage.setContent(TMail.html(nombre,"Reporte de Extractos",accountNumber,url), "text/html");
				helper.setTo(correo);
				helper.setSubject("GBM extracts "+accountNumber);
				helper.setFrom("jdzl@gmail.com");
				javaMailSender.send(mimeMessage);

			}catch (Exception e){}

		return new User(nombre,cedula,correo,url,send);
	}

	@RequestMapping(value = "",method = RequestMethod.GET)
	public String index() {
		return "API usuarios :: working from Spring Boot!";
	}





}
