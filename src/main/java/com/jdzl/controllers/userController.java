package com.jdzl.controllers;

import com.jdzl.models.User;
import com.jdzl.templates.TMail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@Api(value = "users", description = "Users API")
public class userController {

	@Autowired
	private JavaMailSender javaMailSender;


	//localhost:8080/mail/1121891106?name=david zambrano&accountNumber=6665545&email=00jdzl@gmail.com&url=http://linux.com&senttoemail=false
//https://api4-java-sendmail.herokuapp.com/mail/1121891106?name=david zambrano&accountNumber=6665545&email=00jdzl@gmail.com&url=http://linux.com&senttoemail=false

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
	@RequestMapping(value = "/mail/{cc}", method = RequestMethod.GET, produces = "application/json")
	public User mail(@PathVariable String cc,
					 @RequestParam String accountNumber,
					 @RequestParam String name,
					 @Email @Valid @RequestParam String email,
					 @URL @Valid @RequestParam String url,
					 @RequestParam(required = false, defaultValue = "false") boolean sentToEmail) {


		if (sentToEmail)
			try {
				MimeMessage mimeMessage = javaMailSender.createMimeMessage();
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
				mimeMessage.setContent(TMail.html(name, "Reporte de Extractos", accountNumber, url), "text/html");
				helper.setTo(email);
				helper.setSubject("GBM extracts " + accountNumber);
				helper.setFrom("jdzl@gmail.com");
				javaMailSender.send(mimeMessage);

			} catch (Exception e) {
			}

		return new User(name, cc, email, url, sentToEmail);
	}




}
