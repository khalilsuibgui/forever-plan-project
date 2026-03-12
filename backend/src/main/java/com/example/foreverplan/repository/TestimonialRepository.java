package com.example.foreverplan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.foreverplan.model.Testimonial;

public interface TestimonialRepository extends MongoRepository<Testimonial, String> {}
