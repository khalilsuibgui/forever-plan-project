package com.example.foreverplan.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.foreverplan.model.PackageItem;
import com.example.foreverplan.model.ServiceItem;
import com.example.foreverplan.model.Testimonial;
import com.example.foreverplan.repository.PackageItemRepository;
import com.example.foreverplan.repository.ServiceItemRepository;
import com.example.foreverplan.repository.TestimonialRepository;

@Component
public class DataLoader implements CommandLineRunner {
  private final ServiceItemRepository serviceItemRepository;
  private final PackageItemRepository packageItemRepository;
  private final TestimonialRepository testimonialRepository;

  public DataLoader(
      ServiceItemRepository serviceItemRepository,
      PackageItemRepository packageItemRepository,
      TestimonialRepository testimonialRepository) {
    this.serviceItemRepository = serviceItemRepository;
    this.packageItemRepository = packageItemRepository;
    this.testimonialRepository = testimonialRepository;
  }

  @Override
  public void run(String... args) {
    if (serviceItemRepository.count() == 0) {
      serviceItemRepository.saveAll(
          List.of(
              service("Weddings", "Full planning for elegant wedding days.", "ring"),
              service("Corporate Retreat", "Team events with tailored experiences.", "briefcase"),
              service("Private Parties", "Celebrations designed around your story.", "sparkle"),
              service("Custom Decor", "Signature decor and floral styling.", "flower")));
    }

    if (packageItemRepository.count() == 0) {
      packageItemRepository.saveAll(
          List.of(
              pack(
                  "Classic Wedding",
                  "$1,200",
                  "Full planning for up to 150 guests with end-to-end coordination."),
              pack(
                  "Corporate Retreat",
                  "$2,500",
                  "Executive events with logistics, venues, and curated activities."),
              pack(
                  "Private Celebration",
                  "$900",
                  "Boutique celebration planning with personalized details.")));
    }

    if (testimonialRepository.count() == 0) {
      testimonialRepository.saveAll(
          List.of(
              testimonial(
                  "Sarah & John",
                  "Wedding Clients",
                  "Forever Plan made our wedding day absolutely perfect."),
              testimonial(
                  "Maya L.",
                  "Corporate Events",
                  "Smooth planning, clear communication, and a flawless retreat."),
              testimonial(
                  "Daniel R.",
                  "Private Party",
                  "Every detail was thoughtful and beautifully executed.")));
    }
  }

  private ServiceItem service(String title, String description, String icon) {
    ServiceItem item = new ServiceItem();
    item.setTitle(title);
    item.setDescription(description);
    item.setIcon(icon);
    return item;
  }

  private PackageItem pack(String title, String price, String description) {
    PackageItem item = new PackageItem();
    item.setTitle(title);
    item.setPrice(price);
    item.setDescription(description);
    return item;
  }

  private Testimonial testimonial(String name, String role, String message) {
    Testimonial item = new Testimonial();
    item.setName(name);
    item.setRole(role);
    item.setMessage(message);
    return item;
  }
}
