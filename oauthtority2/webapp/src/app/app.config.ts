import { APP_INITIALIZER, ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';
import { routes } from './app.routes';
import { AuthConfig, OAuthService, provideOAuthClient } from 'angular-oauth2-oidc';
import { provideHttpClient } from '@angular/common/http';

// export const authCodeFlowConfig: AuthConfig = {
//   issuer: 'http://localhost:8180/realms/my-test-realm',
//   tokenEndpoint: 'http://localhost:8180/realms/my-test-realm/protocol/openid-connect/token',
//   redirectUri: window.location.origin,
//   clientId: 'my-webapp-client',
//   responseType: 'code',
//   scope: 'openid profile',
//   showDebugInformation: true,
// };


export const authConfig: AuthConfig = {
  issuer: 'https://sts.windows.net/<YOUR_TENANT_ID>/',
  redirectUri: window.location.origin,
  clientId: '<YOUR_ANGULAR_CLIENT_ID>',
  scope: 'openid profile email api://<Spring_Boot_Client_ID>/access_as_user', // Include the scope you defined in the backend registration
  responseType: 'code', // Use the Authorization Code flow (PKCE)
  strictDiscoveryDocumentValidation: false,
  // ... other PKCE related settings
};


// function initializeOAuth(oauthService: OAuthService): Promise<void> {
//   return new Promise((resolve) => {
//     oauthService.configure(authCodeFlowConfig);
//     oauthService.setupAutomaticSilentRefresh();
//     oauthService.loadDiscoveryDocumentAndLogin()
//       .then(() => resolve());
//   });
// }

// export const appConfig: ApplicationConfig = {
//   providers: [
//     provideRouter(routes),
//     provideHttpClient(),
//     provideOAuthClient(),
//     {
//       provide: APP_INITIALIZER,
//       useFactory: (oauthService: OAuthService) => {
//         return () => {
//           initializeOAuth(oauthService);
//         }
//       },
//       multi: true,
//       deps: [
//         OAuthService
//       ]
//     }
//   ]
// };
