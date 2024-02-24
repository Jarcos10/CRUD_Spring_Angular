import { Routes } from '@angular/router';
import { PostCustomerComponent } from './components/post-customer/post-customer.component';
import { GetAllCustomersComponent } from './components/get-all-customers/get-all-customers.component';

export const routes: Routes = [

    {path: "customer", component: PostCustomerComponent},
    {path: "", component: GetAllCustomersComponent},
];
