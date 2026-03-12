import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api/api.service';
import { ServiceItem } from '../api/api.models';

@Component({
  selector: 'app-services',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.scss'],
})
export class ServicesComponent implements OnInit {
  services: ServiceItem[] = [];

  constructor(private api: ApiService) {}

  ngOnInit(): void {
    this.api.getServices().subscribe((items) => {
      this.services = items;
    });
  }
}
