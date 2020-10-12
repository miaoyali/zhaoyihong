package com.example.demo.controller;

import com.example.demo.dao.entity.AEntity;
import com.example.demo.service.AaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Acontroller {

    @Resource
    private AaService aaService;

    @RequestMapping(value = "/f", method = RequestMethod.GET)
    private AEntity findOF(String name){

        AEntity one = aaService.findOne(name);
        System.out.println(one);
        return one;
    }

    private void test(String a){
        System.out.println("赵怡宏000");
    }

    @RequestMapping(value = "/ff", method = RequestMethod.GET)
    private void insert(){
        List<AEntity> l = new ArrayList<AEntity>();
        for(int i=0 ; i<10; i++){
            AEntity aEntity = new AEntity();
            aEntity.setUsername("z"+i);
            aEntity.setPassword("y"+i);
            l.add(aEntity);
        }
        aaService.batchInsertStudent(l);
    }

    @RequestMapping(value = "/daoshuju", method = RequestMethod.GET)
    private void daoshuju(){
        aaService.daoShuJu();
    }
}
