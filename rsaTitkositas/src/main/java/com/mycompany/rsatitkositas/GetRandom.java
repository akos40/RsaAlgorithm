package com.mycompany.rsatitkositas;

import java.math.BigInteger;
import java.util.Random;

public class GetRandom {
    static BigInteger getRandom(BigInteger bottom, BigInteger top){
        Random rand = new Random();
        BigInteger res;
            do {
                res = new BigInteger(top.bitLength(), rand);
            } while (res.compareTo(bottom) < 0 || res.compareTo(top) > 0);
            return res;
    }
}
