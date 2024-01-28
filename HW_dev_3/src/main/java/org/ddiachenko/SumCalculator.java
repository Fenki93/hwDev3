package org.ddiachenko;

public class SumCalculator {

    public int sum(int n){
        int sum = 0;
        if (n == 0){
            throw new IllegalArgumentException("0 is forbidden");
        }
        for (int i = 1; i <= n; i ++) {
            sum += i;
        }
        return sum;
    }
}
