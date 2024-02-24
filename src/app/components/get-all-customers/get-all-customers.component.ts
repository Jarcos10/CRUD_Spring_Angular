import { Component } from '@angular/core';
import { CustomerService } from '../../service/customer.service';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-get-all-customers',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './get-all-customers.component.html',
  styleUrl: './get-all-customers.component.css',
})
export class GetAllCustomersComponent {

  customers: any = [];

  constructor(private service: CustomerService) {}

  ngOnInit(){
    this.getAllCustomers();
  }

  getAllCustomers(){

    this.service.getAllCustomers().subscribe(res => {
      console.log(res);
      
      this.customers = res;

    })
  }
}
