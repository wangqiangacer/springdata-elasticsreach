package com.jacken.springdataelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="wq_duanzi",type="duanzi")
public class DuanZi {
    @Id
    private Integer id;
    private  String content;

    public DuanZi(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public DuanZi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DuanZi{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
