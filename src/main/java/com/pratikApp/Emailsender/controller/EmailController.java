package com.pratikApp.Emailsender.controller;

import com.pratikApp.Emailsender.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String sendEmail(){
        sendEmailService.sendEmail("pratik.jena6371@gmail.com","Test Body"
                                                   ,"Test Subject");
        return "sent Sucessfully";
    }
}
