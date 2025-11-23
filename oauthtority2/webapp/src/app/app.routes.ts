
import { Routes } from '@angular/router';
import { HomeComponent } from '../home/home/home.component';

export const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' }, // Default route redirect
  { path: 'home', component: HomeComponent },
//   { path: '**', component: PageNotFoundComponent } // Wildcard route for 404 pages
];