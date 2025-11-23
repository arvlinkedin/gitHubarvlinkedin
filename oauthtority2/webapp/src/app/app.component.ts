import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet, RouterLink, RouterModule } from '@angular/router';
import { OAuthService } from 'angular-oauth2-oidc';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-root',
  // standalone: true,
  // imports: [CommonModule, RouterOutlet, RouterLink, RouterModule ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
  // imports: [RouterOutlet]
})
export class AppComponent {
  helloText = '';
home: string|any[]|null|undefined;
isScrolledDown = false;
// constructor(private activatedRoute: ActivatedRoute) {
//   this.activatedRoute.queryParams.subscribe(params => {
//     this.home = params['home'];
//   });
// } 

  // constructor(private oauthService: OAuthService, private httpClient: HttpClient) { }

  // logout() {
  //   this.oauthService.logOut();
  // }

  // getHelloText() {
  //   this.httpClient.get<{ message: string }>('http://localhost:8080/hello', {
  //     headers: {
  //       'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
  //     }
  //   }).subscribe(result => {
  //     this.helloText = result.message;
  //   });
  // }
}
