package com.zayyni.main.service;

public class Password {

    String algo;
    public Password(String algo) {
        this.algo = algo;
        System.out.println("Password bean is created");
    }

    public void passWordAlgoUsed(){
        System.out.println("Password algo used is : " + algo);
    }
}
