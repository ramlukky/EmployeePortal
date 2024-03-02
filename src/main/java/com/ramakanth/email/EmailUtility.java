package com.ramakanth.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtility {
	
	@Autowired
	private JavaMailSender mailSender;

	public Boolean sendEmail(String to, String subject, String body) {
		
		Boolean isSent=false;
		try {
		MimeMessage mimemsg=mailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mimemsg);
		helper.setTo(to);
		helper.setText(body, true);
		helper.setSubject(subject);
		mailSender.send(mimemsg);
		isSent=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSent;
	}
}
