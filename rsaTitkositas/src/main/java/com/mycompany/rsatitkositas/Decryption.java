package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class Decryption {
    public static BigInteger[] Decryption(BigInteger[] c, BigInteger p, BigInteger q, BigInteger d){
        BigInteger[] dec = new BigInteger[c.length];
        BigInteger tmpbi;
        
        for(int i = 0; i < c.length; i++){
            tmpbi = KinaiMaradekTetel.KinaiMaradekTetel(c[i], p, q, d);
            dec[i] = tmpbi;
        }
        
        return dec;
    }
}
