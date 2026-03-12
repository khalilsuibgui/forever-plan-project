package com.example.foreverplan.service;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foreverplan.dto.ContactMessageRequest;
import com.example.foreverplan.model.ContactMessage;
import com.example.foreverplan.repository.ContactMessageRepository;

@Service
public class ContactMessageService {
  private final ContactMessageRepository repository;

  public ContactMessageService(ContactMessageRepository repository) {
    this.repository = repository;
  }

  public ContactMessage create(ContactMessageRequest request) {
    ContactMessage message = new ContactMessage();
    message.setName(request.getName());
    message.setEmail(request.getEmail());
    message.setMessage(request.getMessage());
    message.setCreatedAt(Instant.now());
    return repository.save(message);
  }

  public List<ContactMessage> findAll() {
    return repository.findAll();
  }
}
