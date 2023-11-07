package com.example.portfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.Entity.ContactForm;

@CrossOrigin()
@RestController
public class HomeController {

	
	 @Autowired
	    private JavaMailSender emailSender;

	    @PostMapping("/submitForm")
	    public String submitForm(@RequestBody ContactForm form) {
	        // Process the form data and send an email
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("jadhav301196@gmail.com");
	        message.setSubject("New Contact Form Submission");
	        message.setText(
	            "Name: " + form.getFullName() +
	            "\nEmail: " + form.getEmail() +
	            "\nEmailSubject: "+form.getEmailSubject()+
	            "\nContact No: " + form.getPhoneNumber() +
	            "\nMessage: " + form.getMassage()
	        );

	        emailSender.send(message);

	        return "Form submitted successfully!";
	    }
	
}
