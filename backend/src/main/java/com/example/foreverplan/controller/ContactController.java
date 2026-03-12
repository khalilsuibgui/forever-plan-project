package com.example.foreverplan.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foreverplan.dto.ContactMessageRequest;
import com.example.foreverplan.model.ContactMessage;
import com.example.foreverplan.service.ContactMessageService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contact")
@Validated
public class ContactController {
  private final ContactMessageService service;

  public ContactController(ContactMessageService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<ContactMessage> create(@Valid @RequestBody ContactMessageRequest request) {
    return ResponseEntity.ok(service.create(request));
  }

  @GetMapping
  public List<ContactMessage> list() {
    return service.findAll();
  }
}
