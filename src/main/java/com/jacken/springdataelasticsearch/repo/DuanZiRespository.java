package com.jacken.springdataelasticsearch.repo;

import com.jacken.springdataelasticsearch.entity.DuanZi;
import com.jacken.springdataelasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DuanZiRespository extends ElasticsearchRepository<DuanZi, Integer> {
}
