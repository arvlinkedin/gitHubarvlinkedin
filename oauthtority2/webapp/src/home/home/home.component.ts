import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { OAuthService } from 'angular-oauth2-oidc';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Store } from '@ngrx/store';
import { incrementByAmount } from '../../app/ng-rx/counter.action';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  // imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  // Get a logger instance
// const logger = logsAPI.logs.getLogger('my-component-logger');

  helloText = '';
  myForm: FormGroup;

  // constructor(private oauthService: OAuthService, private httpClient: HttpClient) { }
  constructor(private httpClient: HttpClient, private fb: FormBuilder,
    private store: Store<{ counter: { counter: number, totalPrice: number, totalQuantity: number } }>) {

    //  this.myForm = new FormGroup({
    //       username: new FormControl('', Validators.required),
    //       email: new FormControl('', [Validators.required, Validators.email]),
    //       password: new FormControl('', Validators.required),
    //   });

    this.myForm = this.fb.group({
      name: new FormControl('', Validators.required),
      emailField: new FormControl('', [Validators.required, Validators.email]),
    });
  }

  get emailField() {
    return this.myForm.get('emailField') as FormControl;
  }

  get name() {
    const control = this.myForm.get('name');
    return control;
  }



  // emailField?.valueChanges.subscribe(value => {
  //   console.log('Email field value changed:', value);
  // });





  onSubmit() {
    if (this.myForm.valid) {
      console.log(this.myForm.value);
    }
  }


  logout() {
    // this.oauthService.logOut();
  }

  getChartQuantity() {
    const qty: number = 100;
    this.store.dispatch(incrementByAmount(qty));
  }

  getHelloText() {
    this.httpClient.get<{ message: string }>('http://localhost:8080/hello', {
      headers: {
        // 'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      }
    }).subscribe(result => {
      this.helloText = result.message;
    });
  }
}
