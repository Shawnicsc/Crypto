package com.service.controller;


import com.alibaba.fastjson2.JSONObject;
import com.service.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cipher")
public class CipherController {
    @Autowired
    private AES aes;
    @Autowired
    private ECDSA ecd;
    @Autowired
    private SHA256 sha256;
    @Autowired
    private SM2 sm2;
    @Autowired
    private SM3 sm3;
    @Autowired
    private SM4 sm4;

    @PostMapping("/encrypt")
    public String encrypt(@RequestParam("alg") String alg, @RequestParam("text") String text) throws Exception {
        JSONObject jsonObject = new JSONObject();
        switch (alg){
            case "AES":
                jsonObject.put("encryptedText",aes.encrypt(text));
                return jsonObject.toString();
            case "ECDSA":
                jsonObject.put("encryptedText",ecd.encrypt(text));
                return jsonObject.toString();
            case "SHA256":
                jsonObject.put("encryptedText",sha256.encrypt(text));
                return jsonObject.toString();
            case "SM2":
                jsonObject.put("encryptedText",sm2.encrypt(text));
                return jsonObject.toString();
            case "SM3":
                jsonObject.put("encryptedText",sm3.encrypt(text));
                return jsonObject.toString();
            case "SM4":
                jsonObject.put("encryptedText",sm4.encrypt(text));
                return jsonObject.toString();
            default:
                jsonObject.put("encryptedText", "请输入正确的参数");
                return jsonObject.toString();
        }

    }
    @PostMapping("/decrypt")
    public String decrypt(@RequestParam("alg") String alg, @RequestParam("text") String text) throws Exception {
        JSONObject jsonObject = new JSONObject();
        switch (alg){
            case "AES":
                jsonObject.put("decryptedText",aes.decrypt(text));
                return jsonObject.toString();
            case "ECDSA":
                jsonObject.put("decryptedText",ecd.decrypt(text));
                return jsonObject.toString();
            case "SHA256":
                jsonObject.put("decryptedText","this alg can not decrypt ");
                return jsonObject.toString();
            case "SM2":
                jsonObject.put("decryptedText",sm2.decrypt(text));
                return jsonObject.toString();
            case "SM3":
                jsonObject.put("decryptedText","this alg can not decrypt ");
                return jsonObject.toString();
            case "SM4":
                jsonObject.put("decryptedText",sm4.decrypt(text));
                return jsonObject.toString();
            default:
                jsonObject.put("decryptedText","请输入正确的参数");
                return jsonObject.toString();
        }
    }
}
