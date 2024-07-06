package com.springboot_elastic.elastic_search.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(indexName = "customer")
public class ElasticCustomer {

    @Id
    private String id;

    private String name;

    private String email;

    private String phone;

    private String address;

}
