
import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
// import { CartService } from 'src/app/services/cart.service';

@Component({
  selector: 'app-cart-status',
  templateUrl: './cart-status.component.html',
  styleUrl: './cart-status.component.scss'
})
export class CartStatusComponent implements OnInit {
  totalPrice : number = 0; 
  totalQuantity : number = 0;

  // constructor(private cartService: CartService) {}
  constructor(private store: Store<{counter: { counter: number, totalPrice: number, totalQuantity: number } }>) {
    this.store.select("counter").subscribe(counterState => {
      this.totalPrice = counterState.totalPrice;
      this.totalQuantity = counterState.totalQuantity;
    });  

    this.store.select(state => state.counter.totalPrice).subscribe(price => 
        {this.totalPrice = price; console.log('Total Price updated:', price);});
      this.store.select(state => state.counter.totalQuantity).subscribe(quantity => {
        this.totalQuantity = quantity; console.log('Total Quantity updated:', quantity);}
    );
  }

  ngOnInit() {
    this.updateCartStatus();
  }

  updateCartStatus() {
    // subscribe to the cart status totalPrice
    // this.cartService.totalPrice.subscribe((data) => (this.totalPrice = data));

    // // subscribe to the cart status totalQuantity
    // this.cartService.totalQuantity.subscribe(
    //   (data) => (this.totalQuantity = data)
    // );
  }
}
