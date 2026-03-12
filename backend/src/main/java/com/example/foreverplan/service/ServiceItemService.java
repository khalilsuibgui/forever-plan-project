package com.example.foreverplan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foreverplan.model.ServiceItem;
import com.example.foreverplan.repository.ServiceItemRepository;

@Service
public class ServiceItemService {
  private final ServiceItemRepository repository;

  public ServiceItemService(ServiceItemRepository repository) {
    this.repository = repository;
  }

  public List<ServiceItem> findAll() {
    return repository.findAll();
  }
}
