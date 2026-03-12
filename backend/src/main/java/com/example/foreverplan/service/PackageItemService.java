package com.example.foreverplan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foreverplan.model.PackageItem;
import com.example.foreverplan.repository.PackageItemRepository;

@Service
public class PackageItemService {
  private final PackageItemRepository repository;

  public PackageItemService(PackageItemRepository repository) {
    this.repository = repository;
  }

  public List<PackageItem> findAll() {
    return repository.findAll();
  }
}
