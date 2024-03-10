package com.cryptodao.controller;

import com.cryptodao.domain.cipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class daoController {
    @Autowired
    private RestTemplate template;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private com.cryptodao.service.cipherService cipherService;

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody cipher cipher){

        ServiceInstance serviceInstance = loadBalancerClient.choose("crypto-service");
        String url = String.format("http://%s:%s/cipher/encrypt", serviceInstance.getHost(), serviceInstance.getPort());
        // 创建请求体
        MultiValueMap<String, String> param = new LinkedMultiValueMap<>(2);
        param.add("alg", cipher.getAlg());
        param.add("text", cipher.getPlainText());

        String result = template.postForObject(url, param, String.class);
        cipher.setCipherText(result);
        cipher.setPlainText(cipher.getPlainText());
        cipher.setAlg(cipher.getAlg());
        cipherService.Add(cipher);

        return result;
    }
    @PostMapping("/decrypt")
    public String decrypt(@RequestBody cipher cipher){
        ServiceInstance serviceInstance = loadBalancerClient.choose("crypto-service");
        String url = String.format("http://%s:%s/cipher/decrypt", serviceInstance.getHost(), serviceInstance.getPort());
        // 创建请求体
        MultiValueMap<String, String> param = new LinkedMultiValueMap<>(2);
        param.add("alg", cipher.getAlg());
        param.add("text", cipher.getPlainText());

        return template.postForObject(url, param, String.class);
    }
}
