package com.example.foreverplan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.foreverplan.model.PackageItem;

public interface PackageItemRepository extends MongoRepository<PackageItem, String> {}
