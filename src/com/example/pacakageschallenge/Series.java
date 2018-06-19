package com.example.pacakageschallenge;

public class Series {

    // returns the sum of all numbers 1 -> n
    public static int nSum(int n){
        int tempNum = 0;
        for(int i = 0; i<=n; i++){
            tempNum = i+tempNum;

        }
        return tempNum;
    }

    // returns the product of all numbers 1 -> n
    public static int factorial(int n){
        int tempNum = 1;
        for(int i = 1; i<=n; i++){
            tempNum = i*tempNum;

        }
        return tempNum;
    }

    public static int fibonacci(int n){
        int fib[] = new int [n+2];
        int i;

        fib[0] = 0;
        fib[1] = 1;

        for(i = 2; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];

    }


    }



