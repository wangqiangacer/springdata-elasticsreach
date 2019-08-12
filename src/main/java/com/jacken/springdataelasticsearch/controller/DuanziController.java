package com.jacken.springdataelasticsearch.controller;

import com.jacken.springdataelasticsearch.entity.DuanZi;
import com.jacken.springdataelasticsearch.service.DuanziService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@RequestMapping("/duanzi")
@RestController
public class DuanziController {
    @Autowired
    private DuanziService duanziService;

    @RequestMapping("/getDuanzi")
    public  void getDuanzi() {
        try {
            for (int i = 0; i < 50; i++) {
                URL url = new URL("http://duanziwang.com/page/" + (i + 1));
                Document document = Jsoup.parse(url, 100000);
                Elements elements = document.select("h1[class='post-title']");
                for (Element element : elements) {
                    String time = System.currentTimeMillis() + "";
                    String content = element.text();
                    DuanZi duanZi = new DuanZi();
                    duanZi.setId(Integer.parseInt(time.substring(7, 13)));
                    duanZi.setContent(content);
                    //存入es中
                    duanziService.save(duanZi);
                }
                System.out.println("爬取第" + (i + 1) + "页成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/addUser")
    public  void addUser(){
        String time = System.currentTimeMillis() + "";
        DuanZi duanZi = new DuanZi();
        duanZi.setId(Integer.parseInt(time.substring(7, 13)));
        duanZi.setContent("小明同学,你好");
        duanziService.save(duanZi);
    }
    @RequestMapping("/deleteUser")
    public  void deleteUser(){
        DuanZi duanZi = new DuanZi();
        duanZi.setId(757734);
        duanziService.delete(duanZi);

    }
    @RequestMapping("/findByPage")
    public  void findByPage(){
        List<DuanZi> list = duanziService.findByContent("小明同学,你好");
        list.stream().forEach(s-> System.out.println(s));

    }
    @RequestMapping("/updateUser")
    public  void updateUser(){
        DuanZi duanZi = new DuanZi();
        duanZi.setId(853332);
        duanZi.setContent("你好小明");
        duanziService.save(duanZi);
    }
}
