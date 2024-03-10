package com.cryptodao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cryptodao.domain.cipher;

/**
* @author 13627
* @description 针对表【cipher】的数据库操作Service
* @createDate 2024-03-09 23:38:38
*/
public interface cipherService extends IService<cipher> {

    boolean Add(cipher cipher);
}
