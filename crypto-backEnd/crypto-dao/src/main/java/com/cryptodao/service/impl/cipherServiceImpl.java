package com.cryptodao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cryptodao.domain.cipher;
import com.cryptodao.mapper.cipherMapper;
import com.cryptodao.service.cipherService;
import org.springframework.stereotype.Service;

/**
* @author 13627
* @description 针对表【cipher】的数据库操作Service实现
* @createDate 2024-03-09 23:38:38
*/
@Service
public class cipherServiceImpl extends ServiceImpl<cipherMapper, cipher>
    implements cipherService{

    @Override
    public boolean Add(cipher cipher) {
        return this.save(cipher);
    }

}




