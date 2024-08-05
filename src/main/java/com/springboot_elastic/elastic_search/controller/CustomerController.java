package com.springboot_elastic.elastic_search.controller;

import com.springboot_elastic.elastic_search.common.Urls;
import com.springboot_elastic.elastic_search.dto.CustomerDTO;
import com.springboot_elastic.elastic_search.model.ElasticCustomer;
import com.springboot_elastic.elastic_search.services.CustomerService;
import com.springboot_elastic.elastic_search.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerService custService;

    @PostMapping(Urls.CREATE_CUSTOMER_ELASTIC)
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestBody ElasticCustomer customer) {
        logger.info("Creating customer :{}", customer);
        CustomerDTO cust = custService.save(customer);
        return ResponseUtil.createSuccess(cust);
    }

    @GetMapping(Urls.GET_ALL_CUSTOMERS_ELASTIC)
    public ResponseEntity<Map<String, Object>> getAllCustomer() {
        logger.info("Getting all customers");
        List<CustomerDTO> customers = custService.findAll();
        return ResponseUtil.getAllDataSuccess(customers);
    }

    // Endpoint untuk pencarian berdasarkan keys
    @GetMapping(Urls.SEARCH_CUSTOMERS_ELASTIC)
    public List<ElasticCustomer> searchCustomers(@RequestParam String keys) {
        return custService.findByKeys(keys);
    }

    // generate data 1000
    // @PostMapping(Urls.BULK_DATA)
    // public ResponseEntity<Map<String, Object>> bulkCreateCustomers() {
    // logger.info("Creating 1000 customers");
    // custService.generateAndSave1000Customers();
    // return ResponseUtil.createSuccess("1000 customers created successfully");
    // }

}