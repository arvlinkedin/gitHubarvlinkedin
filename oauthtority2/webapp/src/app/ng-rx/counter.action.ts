import { createAction, props } from "@ngrx/store";



export const reset = createAction('[Counter] Reset', props<{ value: number }>());   
export const increment = createAction('[Counter] Increment');
export const decrement = createAction('[Counter] Decrement');   
export const incrementByAmount = createAction('[Counter] Increment By Amount', (amount: number) => ({ amount }));
export const decrementByAmount = createAction('[Counter] Decrement By Amount', (amount: number) => ({ amount }));
export const updateTotalPrice = createAction('[Counter] Update Total Price', (totalPrice: number) => ({ totalPrice }));
export const updateTotalQuantity = createAction('[Counter] Update Total Quantity', (totalQuantity: number) => ({ totalQuantity }));

