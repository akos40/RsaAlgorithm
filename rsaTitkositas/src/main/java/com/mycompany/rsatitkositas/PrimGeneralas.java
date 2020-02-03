package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class PrimGeneralas {
    public static BigInteger PrimGeneralas(){      
        BigInteger n;
        
        while(true){
            n = GetRandom.getRandom(BigInteger.TWO, BigInteger.valueOf(1000000000));
            if(MillerRabin.MillerRabin(n, 5)){
                return n;
            }
        }
    }
}
