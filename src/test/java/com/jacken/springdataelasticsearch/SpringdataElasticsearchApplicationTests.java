package com.jacken.springdataelasticsearch;

import com.jacken.springdataelasticsearch.entity.DuanZi;
import com.jacken.springdataelasticsearch.service.DuanziService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdataElasticsearchApplicationTests {
    @Autowired
    private DuanziService duanziService;
    @Test
    public void contextLoads() {
        String time = System.currentTimeMillis() + "";
        DuanZi duanZi = new DuanZi();
        duanZi.setId(Integer.parseInt(time.substring(7, 13)));
        duanZi.setContent("小明同学");
        duanziService.save(duanZi);
    }

}
