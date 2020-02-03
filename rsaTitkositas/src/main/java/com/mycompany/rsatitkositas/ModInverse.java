package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class ModInverse {
    public static BigInteger ModInverse(BigInteger a, BigInteger m){
        BigInteger m0 = m, x = BigInteger.ONE, y = BigInteger.ZERO;
        
        if(m.equals(BigInteger.ONE)){
            return BigInteger.ZERO;
        }
        
        while(a.compareTo(BigInteger.ONE) == 1){
            BigInteger q = a.divide(m);
            BigInteger b = m;
            m = a.mod(m);
            a = b;
            b = y;
            y = x.subtract(q.multiply(y));
            x = b;
        }
        
        if(x.compareTo(BigInteger.ZERO) == -1){
            x = x.add(m0);
        }
        
        return x;
    }
}
