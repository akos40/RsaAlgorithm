package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class FermatTeszt {
    public static boolean FermatTeszt(BigInteger n, int k){
        if(n.compareTo(BigInteger.valueOf(1)) <= 0 || n.equals(BigInteger.valueOf(4))){
            System.out.println("1");
            return false;
        }
        
        if(n.compareTo(BigInteger.valueOf(3)) <= 0){
            System.out.println("2");
            return true;
        }
        
        while(k > 1){
            BigInteger a = GetRandom.getRandom(BigInteger.ZERO, n);
            a = a.modPow(n.subtract(BigInteger.valueOf(1)), n);
            if (!a.equals(BigInteger.valueOf(1))){
                System.out.println("3");
                return false;
            }
            k--;
        }
        
        System.out.println("4");
        return true;
    }
}
