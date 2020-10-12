package com.example.demo.dao2;

import com.example.demo.dao2.entity.AEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BbMapper {
    //void batchInsertStudent(List<AEntity> item);
    void insertOne(AEntity aEntity);
}