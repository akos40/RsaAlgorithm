package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class KibovitettEuklidesz {
    public static BigInteger[] KibovitettEuklidesz(BigInteger a, BigInteger b){
        BigInteger x0 = BigInteger.ONE;
        BigInteger x1 = BigInteger.ZERO;
        BigInteger y0 = BigInteger.ZERO;
        BigInteger y1 = BigInteger.ONE;
        BigInteger s = BigInteger.ONE;
        BigInteger x, y;
        while(b.equals(BigInteger.ZERO) == false){
            BigInteger r = a.mod(b);
            BigInteger q = a.divide(b);
            a = b;
            b = r;
            x = x1;
            y = y1;
            x1 = q.multiply(x1).add(x0);
            y1 = q.multiply(y1).add(y0);
            x0 = x;
            y0 = y;
            s = s.negate();
        }
        
        x = s.multiply(x0);
        y = s.multiply(y0.negate());
        
        BigInteger[] ret = new BigInteger[3];
        ret[0] = a;
        ret[1] = x;
        ret[2] = y;
        
        return ret;
    }
}
