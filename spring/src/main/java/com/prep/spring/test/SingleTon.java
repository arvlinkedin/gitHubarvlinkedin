package com.prep.spring.test;

public final class SingleTon {
    private static SingleTon instance = new SingleTon();
    private SingleTon(){
    }

    public SingleTon getInstnace() {
          return instance;
    }
}
