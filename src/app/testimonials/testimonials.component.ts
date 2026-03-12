import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api/api.service';
import { Testimonial } from '../api/api.models';

@Component({
  selector: 'app-testimonials',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './testimonials.component.html',
  styleUrls: ['./testimonials.component.scss'],
})
export class TestimonialsComponent implements OnInit {
  testimonials: Testimonial[] = [];

  constructor(private api: ApiService) {}

  ngOnInit(): void {
    this.api.getTestimonials().subscribe((items) => {
      this.testimonials = items;
    });
  }
}
