package com.xworkz.mall.service;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;
import com.xworkz.mall.repo.CustomerRopository;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRopository repo;

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CustomerEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.out.println("Error in data so please fix it");
		} else {
			System.out.println("Data is saves sucessfully");
			repo.save(entity);
		}

		return true;
	}

/*	@Override
	public boolean ValidateAndSave(CustomerFeedbackEntity entity) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CustomerFeedbackEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.out.println("Error in data so please fix it");
		} else {
			System.out.println("Data is saves sucessfully");
			repo.save(entity);
		}
		return true;
	}*/

	@Override
	public List<CustomerEntity> findByName(String name) {

		return this.repo.findByName(name);
	}

	@Override
	public boolean findByEmail(String email) {
		List<CustomerEntity> find= repo.findByEmail(email);
		if(find != null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
			List<CustomerEntity> findByMobileNo= repo.findByMobileNo(mobileNo);
			if(findByMobileNo != null) {
				System.out.println("mobile");
				return false;
			}else {
				return true;
			}	
	}
	
	
	@Override
	public boolean sendMail(String email) {
		
		final String username = "sushmays1997@outlook.com";
		final String password = "Sushma@123";

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp-mail.outlook.com");
		properties.put("mail.smtp.port", "587");
// Session is class reprez
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);

			}
		});
		session.setDebug(true);

		try {
// Message is abstract class
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("Feedback Confirmation");
			message.setText("Thank you for giving feedback");					
			Transport.send(message);

			System.out.println("Message Done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return true;
	}

}
