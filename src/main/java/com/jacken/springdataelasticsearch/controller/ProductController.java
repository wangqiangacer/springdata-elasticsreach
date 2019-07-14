package com.jacken.springdataelasticsearch.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.jacken.springdataelasticsearch.entity.DuanZi;
import com.jacken.springdataelasticsearch.entity.Product;
import com.jacken.springdataelasticsearch.service.DuanziService;
import com.jacken.springdataelasticsearch.service.ProductService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RequestMapping("/product")
@RestController
public class ProductController {


    @Autowired
    private ProductService productService;
    @Autowired
    private DuanziService duanziService;

    private ObjectMapper mapper = new ObjectMapper();
    @RequestMapping("/save")
    public  void save(){
        productService.save(new Product(1L, "电吹风","飞利浦", "小家电"));
        productService.save(new Product(2L, "电吹风","美的", "小家电"));
        productService.save(new Product(3L, "电吹风","松下", "小家电"));
        productService.save(new Product(4L, "电吹风","索尼", "小家电"));
        productService.save(new Product(5L, "电吹风","华为", "小家电"));
        productService.save(new Product(6L, "电吹风","海尔", "小家电"));
        productService.save(new Product(7L, "电吹风","戴森", "小家电"));
        productService.save(new Product(8L, "电吹风","九阳", "小家电"));
        productService.save(new Product(9L, "洗衣机","海尔", "小家电"));
        productService.save(new Product(10L, "洗衣机","美的", "小家电"));
        productService.save(new Product(11L, "电视机", "飞利浦","小家电"));
        productService.save(new Product(12L, "电视机", "索尼","小家电"));
        productService.save(new Product(13L, "电视机", "夏普","小家电"));
        productService.save(new Product(14L, "电视机", "微鲸","小家电"));
        productService.save(new Product(15L, "电视机", "小米","小家电"));
        productService.save(new Product(16L, "电视机", "长虹","小家电"));
        productService.save(new Product(17L, "电视机", "海尔","小家电"));
        productService.save(new Product(18L, "电视机", "乐视","小家电"));;
        productService.save(new Product(19L, "冰箱","飞利浦", "小家电"));
        productService.save(new Product(20L, "音箱", "飞利浦","小家电"));
        productService.save(new Product(21L, "手电筒","飞利浦", "小家电"));
        productService.save(new Product(22L, "节能灯", "飞利浦","小家电"));
        productService.save(new Product(23L, "手机", "华为","数码电子"));
        productService.save(new Product(24L, "手机", "vivo","数码电子"));
        productService.save(new Product(25L, "手机", "oppo","数码电子"));
        productService.save(new Product(26L, "手机", "魅族","数码电子"));
        productService.save(new Product(27L, "手机", "小米","数码电子"));
        productService.save(new Product(28L, "手机", "摩托罗拉","数码电子"));
        productService.save(new Product(29L, "手机", "金立","数码电子"));
        productService.save(new Product(30L, "手机", "酷派","数码电子"));
        productService.save(new Product(31L, "手机", "格力","数码电子"));
        productService.save(new Product(32L, "摄像机", "飞利浦","数码电子"));
        productService.save(new Product(33L, "照相机","飞利浦", "数码电子"));
        productService.save(new Product(34L, "mp3", "飞利浦","数码电子"));
        productService.save(new Product(35L, "手环", "飞利浦","数码电子"));
        productService.save(new Product(36L, "iwatch","飞利浦", "数码电子"));
        productService.save(new Product(37L, "床", "飞利浦","家具"));
        System.out.println("保存成功");

    }
}
