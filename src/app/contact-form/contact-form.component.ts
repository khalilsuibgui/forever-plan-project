import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { ApiService } from '../api/api.service';
import { ContactMessageRequest } from '../api/api.models';

@Component({
  selector: 'app-contact-form',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './contact-form.component.html',
  styleUrls: ['./contact-form.component.scss'],
})
export class ContactFormComponent {
  contact: ContactMessageRequest = {
    name: '',
    email: '',
    message: '',
  };
  isSubmitting = false;
  successMessage = '';
  errorMessage = '';

  constructor(private api: ApiService) {}

  submit(form: NgForm) {
    if (this.isSubmitting) {
      return;
    }

    this.isSubmitting = true;
    this.successMessage = '';
    this.errorMessage = '';

    this.api.createContactMessage(this.contact).subscribe({
      next: () => {
        this.successMessage = 'Message sent. Thank you!';
        this.contact = { name: '', email: '', message: '' };
        form.resetForm();
        this.isSubmitting = false;
      },
      error: () => {
        this.errorMessage = 'Failed to send message. Please try again.';
        this.isSubmitting = false;
      },
    });
  }
}
