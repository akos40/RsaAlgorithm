package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class KinaiMaradekTetel {
    public static BigInteger KinaiMaradekTetel(BigInteger c, BigInteger p, BigInteger q, BigInteger d){
        BigInteger M = p.multiply(q);
        
        BigInteger c1 = c.modPow(d.mod(p.subtract(BigInteger.ONE)), p);
        BigInteger c2 = c.modPow(d.mod(q.subtract(BigInteger.ONE)), q);
        
        BigInteger m1 = null;
        BigInteger m2 = null;
        
        if(p.compareTo(q) > 0){
            m1 = p;
            m2 = q;
        }else if(p.compareTo(q) < 0){
            m1 = q;
            m2 = p;
        }
        
        BigInteger[] Y = KibovitettEuklidesz.KibovitettEuklidesz(m1, m2);
        
        BigInteger m = ((c1.multiply(Y[1]).multiply(m1)).add(c2.multiply(Y[2]).multiply(m2))).mod(M);
        
        return m;
    }
}