import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api/api.service';
import { PackageItem } from '../api/api.models';

@Component({
  selector: 'app-packages',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './packages.component.html',
  styleUrls: ['./packages.component.scss'],
})
export class PackagesComponent implements OnInit {
  packages: PackageItem[] = [];

  constructor(private api: ApiService) {}

  ngOnInit(): void {
    this.api.getPackages().subscribe((items) => {
      this.packages = items;
    });
  }
}
