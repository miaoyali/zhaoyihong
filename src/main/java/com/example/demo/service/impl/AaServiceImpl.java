package com.example.demo.service.impl;

import com.example.demo.dao.AaMapper;
import com.example.demo.dao.entity.AEntity;
import com.example.demo.service.AaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AaServiceImpl implements AaService {
    @Resource
    private AaMapper aaMapper;
    @Override
    public AEntity findOne(String name) {

        return aaMapper.findOne(name);
    }

    @Override
    public void batchInsertStudent(List<AEntity> item) {
         aaMapper.batchInsertStudent(item);
    }
}
