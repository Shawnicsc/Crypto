package com.service.services;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class AES {
    private static final String key = "2021211973";
    private SymmetricCrypto aes;
    public AES(){
        byte[] Key = convertKey();
        //构建
        aes = new SymmetricCrypto(SymmetricAlgorithm.AES, Key);
    }
    public String encrypt(String message){
        return aes.encryptHex(message);
    }

    public String decrypt(String message){
        String decryptStr = aes.decryptStr(message, CharsetUtil.CHARSET_UTF_8);
        return decryptStr;
    }

    private byte[] convertKey(){
        // 将String类型的数字转换为BigInteger
        BigInteger originalBigInt = new BigInteger(key);

        // 左移96位，将10位数字扩展到128位
        BigInteger expandedBigInt = originalBigInt.shiftLeft(96);

        return expandedBigInt.toByteArray();
    }

}
