package com.springboot_elastic.elastic_search.repository;

import com.springboot_elastic.elastic_search.model.ElasticCustomer;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<ElasticCustomer, String> {
    List<ElasticCustomer> findByNameContainingOrEmailContainingOrPhoneContainingOrAddressContaining(String name,
            String email, String phone, String address);

    List<ElasticCustomer> findByNameContaining(String name);
}