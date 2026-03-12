package com.example.foreverplan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.foreverplan.model.ServiceItem;

public interface ServiceItemRepository extends MongoRepository<ServiceItem, String> {}
