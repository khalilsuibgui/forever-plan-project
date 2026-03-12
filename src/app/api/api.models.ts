export interface ContactMessageRequest {
  name: string;
  email: string;
  message: string;
}

export interface ContactMessageResponse {
  id: string;
  name: string;
  email: string;
  message: string;
  createdAt: string;
}

export interface ServiceItem {
  id?: string;
  title: string;
  description?: string;
  icon?: string;
}

export interface PackageItem {
  id?: string;
  title: string;
  price: string;
  description: string;
}

export interface Testimonial {
  id?: string;
  name: string;
  role?: string;
  message: string;
}
