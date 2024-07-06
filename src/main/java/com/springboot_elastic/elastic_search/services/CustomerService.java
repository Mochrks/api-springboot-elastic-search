package com.springboot_elastic.elastic_search.services;

import com.springboot_elastic.elastic_search.dto.CustomerDTO;
import com.springboot_elastic.elastic_search.exception.CustomerNotFoundException;
import com.springboot_elastic.elastic_search.model.ElasticCustomer;
import com.springboot_elastic.elastic_search.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepo;

    public CustomerDTO save(ElasticCustomer customer) {
        logger.info("Saving customer :{}", customer);
        ElasticCustomer cust = ElasticCustomer.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .address(customer.getAddress())
                .build();

        ElasticCustomer savedCustomer = customerRepo.save(cust);
        CustomerDTO response = toDTO(savedCustomer);
        logger.info("Store data in elastic search", response);
        return response;
    }

    public List<CustomerDTO> findAll() {
        logger.info("Fetching all customers from elastic search");
        Iterable<ElasticCustomer> customersIterable = customerRepo.findAll();
        List<ElasticCustomer> customers = StreamSupport.stream(customersIterable.spliterator(), false)
                .collect(Collectors.toList());
        return customers.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public List<ElasticCustomer> findByKeys(String keys) {

        return customerRepo.findByNameContainingOrEmailContainingOrPhoneContainingOrAddressContaining(keys, keys, keys,
                keys);

    }

    private CustomerDTO toDTO(ElasticCustomer customer) {
        return CustomerDTO.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .address(customer.getAddress())
                .build();
    }

    // public void generateAndSave1000Customers() {
    // logger.info("Generating and saving 1000 customers");
    // List<ElasticCustomer> customers = new ArrayList<>();

    // for (int i = 0; i < 1000; i++) {
    // ElasticCustomer customer = ElasticCustomer.builder()
    // .id(UUID.randomUUID().toString())
    // .name("Customer " + i)
    // .email("customer" + i + "@example.com")
    // .phone("123456789" + i)
    // .address("Address " + i)
    // .build();
    // customers.add(customer);
    // }

    // customerRepo.saveAll(customers);
    // logger.info("1000 customers saved in elastic search");
    // }
}