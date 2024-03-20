package com.service_order.service.customer_service;

import com.service_order.service.dto.customer_dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-FEIGN-CLIENT")
public interface CustomerApiService {

    List<CustomerDto> findAllCustomers();

    CustomerDto findCustomerById(@PathVariable("id") Long id);

    List<CustomerDto> findCustomersByName(@PathVariable("name") String name);

}
