package com.doconnect.doconnectservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/*
     * @Author : Banoth Kalyan
     * Created Date : 25-8-2022
     * Modified Date : 29-8-2022
     * Description : Email Service implementation
     * Params : String toEmail,String body,String subject
     * Return Type : None
	 * Exception : None
     */


@Service
public class EmailSenderService {

    @Autowired
    JavaMailSender javaMailSender;


    @Async
    public void sendMail(String toEmail,String body,String subject)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("darshankhairnar73@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        javaMailSender.send(message);

    }
    
}
