package com.mycompany.rsatitkositas;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        BigInteger p = PrimGeneralas.PrimGeneralas();
        BigInteger q = PrimGeneralas.PrimGeneralas();

        BigInteger n = p.multiply(q);
        BigInteger fin = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger e;
        
        while(true){
            e = GetRandom.getRandom(BigInteger.ONE, fin);
            
            if(KibovitettEuklidesz.KibovitettEuklidesz(fin, e)[0].compareTo(BigInteger.ONE) == 0){
                break;
            }
        }
        
        BigInteger d;
        d = ModInverse.ModInverse(e, fin);
        
        String str = "TITKOSITANDO SZOVEG";
        
        System.out.println("p: " + p + " q: " + q + " n: " + n + " fin: " + fin + " e: " + e + " d: " + d);
        
        BigInteger[] c = Encryption.Encryption(str, e, n);
        
        int i, tmp;
        String encryptedStr = "";
        String decryptedStr = "";
        
        for(i = 0; i < c.length; i++){
            tmp = c[i].mod(BigInteger.valueOf(26)).intValue() + 'A';
            encryptedStr += (char)tmp;
        }
        
        System.out.println("Titkosított: " + encryptedStr);
        
        BigInteger[] m = Decryption.Decryption(c, p, q, d);
        
        for(i = 0; i < m.length; i++){
            tmp = m[i].intValue();
            decryptedStr += (char)tmp;
        }
        
        System.out.println("Visszafejtett: " + decryptedStr);
    }
}
