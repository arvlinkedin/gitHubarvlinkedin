import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { FormsModule, NgModel, ReactiveFormsModule } from "@angular/forms";
import { OAuthModule } from "angular-oauth2-oidc";
import { AppRoutingModule } from './app-routing.module';
import { CommonModule } from "@angular/common";
import { RouterLink, RouterModule, RouterOutlet } from "@angular/router";
import { AppComponent } from "./app.component";
import { HomeComponent } from "../home/home/home.component";
import { BrowserModule } from "@angular/platform-browser";
import { ProductCategoryMenuComponent } from "./components/product-category-menu/product-category-menu.component";
import { LoginStatusComponent } from "./components/login-status/login-status.component";
import { CartStatusComponent } from "./components/cart-status/cart-status.component";
import { SearchComponent } from "./components/search/search.component";
import { provideStore, StoreModule } from "@ngrx/store";
import { counterReducer } from "./ng-rx/counter.reducer";


@NgModule({
    declarations: [AppComponent, 
        HomeComponent, ProductCategoryMenuComponent, 
    LoginStatusComponent,
CartStatusComponent, SearchComponent],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule ,
    ReactiveFormsModule,
    // OAuthModule.forRoot(),
    AppRoutingModule,
    CommonModule, RouterOutlet, RouterLink, RouterModule,
    // StoreModule.forRoot({ counter1: counterReducer })  old way
],
exports: [RouterModule],
providers: [
    provideStore ({ counter: counterReducer })
],
bootstrap: [AppComponent]

})
export class AppModule { }