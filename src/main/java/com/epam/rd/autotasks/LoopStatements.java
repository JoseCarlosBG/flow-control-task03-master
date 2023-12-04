package com.epam.rd.autotasks;


class LoopStatements {
    public static int sumOfFibonacciNumbers(int n) {
        int result;
        if (n<=0){
            return 0;
        }
        else{
            int[] fib = new int[n];
            fib[0]=0;
            fib[1]=1;
            result=0;
            result=result+fib[0]+fib[1];
            for (int i=2; i<n;i++){
                fib[i]=fib[i-1]+fib[i-2];
                result=result+fib[i];
            }
        }
        return result;
    }

}
