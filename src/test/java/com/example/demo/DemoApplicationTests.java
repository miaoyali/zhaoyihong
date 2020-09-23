package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
   // @Resource
   // private RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        RestTemplate restTemplate = new RestTemplate();
        String url="https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13525277066";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);
        String s = forObject.substring(forObject.indexOf("{"),forObject.indexOf("}")+1);
        System.out.println(s);
        JSONObject jsonObject = JSONObject.parseObject(s);
          String province=jsonObject.getString("province");
        String str1="北京市,天津市,上海市,重庆市";
        if(str1.contains(province)) {
            province = province + "市";
        }else if("内蒙古自治区".contains(province)) {
            province = "内蒙古自治区";
        }else if("宁夏回族自治区".contains(province)) {
            province = "宁夏回族自治区";
        }else if("广西壮族自治区".contains(province)) {
            province = "广西壮族自治区";
        }else if("新疆维吾尔自治区".contains(province)) {
            province = "新疆维吾尔自治区";
        }else if("西藏自治区".contains(province)) {
            province = "西藏自治区";
        }else if("香港特别行政区".contains(province)) {
            province = "香港特别行政区";
        }else if("澳门特别行政区".contains(province)) {
            province = "澳门特别行政区";
        }else {
            province = province + "省";
        }
        System.out.println("haha++++"+province);
    }

}
