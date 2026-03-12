import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import {
  ContactMessageRequest,
  ContactMessageResponse,
  PackageItem,
  ServiceItem,
  Testimonial,
} from './api.models';

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  private readonly baseUrl = environment.apiUrl;

  constructor(private http: HttpClient) {}

  getServices(): Observable<ServiceItem[]> {
    return this.http.get<ServiceItem[]>(`${this.baseUrl}/services`);
  }

  getPackages(): Observable<PackageItem[]> {
    return this.http.get<PackageItem[]>(`${this.baseUrl}/packages`);
  }

  getTestimonials(): Observable<Testimonial[]> {
    return this.http.get<Testimonial[]>(`${this.baseUrl}/testimonials`);
  }

  createContactMessage(
    payload: ContactMessageRequest,
  ): Observable<ContactMessageResponse> {
    return this.http.post<ContactMessageResponse>(
      `${this.baseUrl}/contact`,
      payload,
    );
  }
}
