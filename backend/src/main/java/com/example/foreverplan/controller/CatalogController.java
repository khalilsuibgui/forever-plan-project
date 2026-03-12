package com.example.foreverplan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foreverplan.model.PackageItem;
import com.example.foreverplan.model.ServiceItem;
import com.example.foreverplan.model.Testimonial;
import com.example.foreverplan.service.PackageItemService;
import com.example.foreverplan.service.ServiceItemService;
import com.example.foreverplan.service.TestimonialService;

@RestController
@RequestMapping("/api")
public class CatalogController {
  private final ServiceItemService serviceItemService;
  private final PackageItemService packageItemService;
  private final TestimonialService testimonialService;

  public CatalogController(
      ServiceItemService serviceItemService,
      PackageItemService packageItemService,
      TestimonialService testimonialService) {
    this.serviceItemService = serviceItemService;
    this.packageItemService = packageItemService;
    this.testimonialService = testimonialService;
  }

  @GetMapping("/services")
  public List<ServiceItem> services() {
    return serviceItemService.findAll();
  }

  @GetMapping("/packages")
  public List<PackageItem> packages() {
    return packageItemService.findAll();
  }

  @GetMapping("/testimonials")
  public List<Testimonial> testimonials() {
    return testimonialService.findAll();
  }
}
