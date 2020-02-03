package com.mycompany.rsatitkositas;

import java.math.BigInteger;
import java.util.Random;

public class MillerRabin {
    public static boolean MillerRabin(BigInteger n, int k){
        if (n.compareTo(BigInteger.ONE) == 0)
            return false;
        
        if (n.compareTo(BigInteger.valueOf(3)) < 0)
            return true;
        
        int s = 0;
        BigInteger d = n.subtract(BigInteger.ONE);
        
        while (d.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            s++;
            d = d.divide(BigInteger.TWO);
        }
        
        for (int i = 0; i < k; i++) {
            BigInteger a = GetRandom.getRandom(BigInteger.TWO, n.subtract(BigInteger.TWO));
            BigInteger x = a.modPow(d, n);
            
            if (x.equals(BigInteger.ONE) || x.equals(n.subtract(BigInteger.ONE)))
                continue;
            
            int r;
            for (r = 0; r < s; r++) {
                x = x.modPow(BigInteger.TWO, n);
                if (x.equals(BigInteger.ONE))
                    return false;
                
                if (x.equals(n.subtract(BigInteger.ONE)))
                    break;
            }
            
            if (r == s)
                return false;
        }
        return true;
    }
}
