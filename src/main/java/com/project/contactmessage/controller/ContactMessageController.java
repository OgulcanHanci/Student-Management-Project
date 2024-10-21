package com.project.contactmessage.controller;

import com.project.contactmessage.entity.ContactMessage;
import com.project.contactmessage.service.ContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//restAPİ olduğunu göstermek için @Controller yerine @RestController yazdık
@RequestMapping("/contactMessages")
@RequiredArgsConstructor
public class ContactMessageController {

    private final ContactMessageService contactMessageService;

    @PostMapping("/save") //http://localhost:8080/contactMessages/save + POST + JSON
    public ResponseEntity<ContactMessage> save(){

    }
}
