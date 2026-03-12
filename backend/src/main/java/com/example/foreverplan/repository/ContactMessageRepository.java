package com.example.foreverplan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.foreverplan.model.ContactMessage;

public interface ContactMessageRepository extends MongoRepository<ContactMessage, String> {}
