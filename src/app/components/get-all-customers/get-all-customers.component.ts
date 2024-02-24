import { Component } from '@angular/core';
import { CustomerService } from '../../service/customer.service';

@Component({
  selector: 'app-get-all-customers',
  standalone: true,
  imports: [],
  templateUrl: './get-all-customers.component.html',
  styleUrl: './get-all-customers.component.css',
})
export class GetAllCustomersComponent {

  constructor(private service: CustomerService) {}

  ngOnInit(){
    this.getAllCustomers();
  }

  getAllCustomers(){
    
    this.service.getAllCustomers().subscribe(res => {

      console.log(res);

    })
  }
}
