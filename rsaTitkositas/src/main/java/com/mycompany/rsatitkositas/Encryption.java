package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class Encryption {
    public static BigInteger[] Encryption(String s, BigInteger e, BigInteger n){
        BigInteger[] enc = new BigInteger[s.length()];
        BigInteger tmpbi;
        
        for(int i = 0; i < s.length(); i++){
            tmpbi = BigInteger.valueOf(s.charAt(i)).modPow(e, n);
            enc[i] = tmpbi;
        }
        
        return enc;
    }
}
