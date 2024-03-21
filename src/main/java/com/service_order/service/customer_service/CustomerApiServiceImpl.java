package com.service_order.service.customer_service;

import com.service_order.client.CustomerApiClient;
import com.service_order.service.dto.customer_dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerApiServiceImpl implements CustomerApiService{

    private final CustomerApiClient customerApiClient;

    public CustomerApiServiceImpl(CustomerApiClient customerApiClient) {
        this.customerApiClient = customerApiClient;
    }

    @Override
    public List<CustomerDto> findAllCustomers() {
        return customerApiClient.findAllCustomers();
    }

    @Override
    public CustomerDto findCustomerById(Long id) {
        return customerApiClient.findCustomerById(id);
    }

    @Override
    public List<CustomerDto> findCustomersByName(String name) {
        return customerApiClient.findCustomersByName(name);
    }

}
