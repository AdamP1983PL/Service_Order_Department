package com.service_order.client;

import com.service_order.service.dto.customer_dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-DEPARTMENT")
public interface CustomerApiClient {

    @GetMapping("/customer/")
    List<CustomerDto> findAllCustomers();

    @GetMapping("/customer/{id}")
    CustomerDto findCustomerById(@PathVariable("id") Long id);

    @GetMapping("/customer/name/{name}")
    List<CustomerDto> findCustomersByName(@PathVariable("name") String name);

}
