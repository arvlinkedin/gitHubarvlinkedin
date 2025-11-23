import { HttpClient } from "@angular/common/http";
import { OAuthService } from "angular-oauth2-oidc";


export class HttpServices {

  constructor(private httpClient: HttpClient, private oauthService: OAuthService) { }   

    getHelloText() {

    return this.httpClient.get<{ message: string }>('http://localhost:8080/api/getStudents', {
      headers: {
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`         
        }
         });     
    }  

}