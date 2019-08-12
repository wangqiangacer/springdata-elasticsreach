package com.jacken.springdataelasticsearch.repo;

import com.jacken.springdataelasticsearch.entity.DuanZi;
import com.jacken.springdataelasticsearch.entity.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface DuanZiRespository extends ElasticsearchRepository<DuanZi, Integer> {
   List<DuanZi> findAllByContent(String content);
}
