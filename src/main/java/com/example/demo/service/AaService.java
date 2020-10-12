package com.example.demo.service;

import com.example.demo.dao.entity.AEntity;

import java.util.List;

public interface AaService {
    AEntity findOne(String name);
    void batchInsertStudent(List<AEntity> item);
    void daoShuJu();
}
