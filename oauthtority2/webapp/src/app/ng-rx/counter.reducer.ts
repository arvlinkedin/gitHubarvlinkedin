import { createReducer, on } from "@ngrx/store";
import { decrement, decrementByAmount, increment, incrementByAmount, reset, updateTotalPrice, updateTotalQuantity } from "./counter.action";
import { initialCounterStateData } from "./counter.state";

export const counterReducer = createReducer(
    initialCounterStateData,
    on(reset, (state, { value }) => ({ ...state, counter : value})), 
    on(increment, (state) => ({ ...state, counter: state.counter + 1 })),
    on(decrement, (state) => ({ ...state, counter: state.counter - 1 })),
    on(incrementByAmount, (state, { amount }) => ({ ...state, counter: state.totalPrice + amount })),
    on(decrementByAmount, (state, { amount }) => ({ ...state, counter: state.totalPrice - amount })),
    on(updateTotalPrice, (state, { totalPrice }) => ({ ...state, totalPrice })),
    on(updateTotalQuantity, (state, { totalQuantity }) => ({ ...state, totalQuantity }))
);
