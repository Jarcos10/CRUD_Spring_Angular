import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CustomerService } from '../../service/customer.service';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-update-customer',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './update-customer.component.html',
  styleUrl: './update-customer.component.css'
})
export class UpdateCustomerComponent {

  updateCustomerForm!: FormGroup;
  id:number = this.activatedRoute.snapshot.params["id"];
  constructor(private activatedRoute: ActivatedRoute, private service: CustomerService, private fb: FormBuilder){

  }

  ngOnInit(){

    this.updateCustomerForm = this.fb.group({

      name: [null, Validators.required],
      email: [null, [Validators.required, Validators.email]],
      phone: [null, Validators.required],
    })

    this.getCustomerById();

  }

  getCustomerById(){
    this.service.getCustomerById(this.id).subscribe(res => {

      console.log(res);
      this.updateCustomerForm.patchValue(res);
    })
  }

}
