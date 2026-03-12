package com.example.foreverplan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foreverplan.model.Testimonial;
import com.example.foreverplan.repository.TestimonialRepository;

@Service
public class TestimonialService {
  private final TestimonialRepository repository;

  public TestimonialService(TestimonialRepository repository) {
    this.repository = repository;
  }

  public List<Testimonial> findAll() {
    return repository.findAll();
  }
}
