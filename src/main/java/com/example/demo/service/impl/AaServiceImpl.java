package com.example.demo.service.impl;

import com.example.demo.dao.AaMapper;
import com.example.demo.dao.entity.AEntity;
import com.example.demo.dao2.BbMapper;
import com.example.demo.service.AaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AaServiceImpl implements AaService {
    @Resource
    private AaMapper aaMapper;

    @Resource
    private BbMapper bbMapper;


    @Override
    public AEntity findOne(String name) {

        return aaMapper.findOne(name);
    }

    @Override
    public void batchInsertStudent(List<AEntity> item) {
         aaMapper.batchInsertStudent(item);
    }

    @Override
    @Transactional
    public void daoShuJu() {
        AEntity zhangsan = aaMapper.findOne("zhangsan");
        System.out.println(zhangsan);
        com.example.demo.dao2.entity.AEntity aEntity = new com.example.demo.dao2.entity.AEntity();
        aEntity.setPassword("123");
        aEntity.setUsername("张三");
        bbMapper.insertOne(aEntity);
    }
}
