package com.jacken.springdataelasticsearch.service.impl;

import com.jacken.springdataelasticsearch.entity.DuanZi;
import com.jacken.springdataelasticsearch.repo.DuanZiRespository;
import com.jacken.springdataelasticsearch.service.DuanziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuanziServiceImpl  implements DuanziService {
    @Autowired
    private DuanZiRespository duanZiRespository;
    @Override
    public DuanZi save(DuanZi duanZi) {
        return duanZiRespository.save(duanZi);
    }

    @Override
    public void delete(DuanZi duanZi) {
        duanZiRespository.delete(duanZi);
    }

    @Override
    public List<DuanZi> findByContent(String content) {
        return duanZiRespository.findAllByContent(content);
    }


}
