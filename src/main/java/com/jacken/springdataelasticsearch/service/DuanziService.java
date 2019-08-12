package com.jacken.springdataelasticsearch.service;

import com.jacken.springdataelasticsearch.entity.DuanZi;

import java.util.List;

public interface DuanziService {
    DuanZi save(DuanZi duanZi);
    void delete(DuanZi duanZi);
    List<DuanZi> findByContent(String content);

}
