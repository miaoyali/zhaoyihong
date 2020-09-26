package com.example.demo.dao;

import com.example.demo.dao.entity.AEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AaMapper {
        AEntity findOne(String name);
        void batchInsertStudent(List<AEntity> item);
}
