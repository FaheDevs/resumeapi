package com.faheDevs.resumeapi.controllers;

import com.faheDevs.resumeapi.apiManagement.contactManagement.ContactService;
import com.faheDevs.resumeapi.controllers.DTOs.ContactDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cv/contact")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    @Operation(summary = "Get all contacts", description = "Returns a list of all contacts")
    public ResponseEntity<ContactDTO> getAllContacts() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }
}