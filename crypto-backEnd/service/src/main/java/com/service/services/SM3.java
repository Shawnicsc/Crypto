package com.service.services;

import cn.hutool.crypto.SmUtil;
import org.springframework.stereotype.Service;

@Service
public class SM3 {

    public String encrypt(String message){
        return SmUtil.sm3(message);
    }

}
