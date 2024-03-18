package com.service_order.service.customer_service;

import com.service_order.client.CustomerApiClient;
import com.service_order.service.dto.customer_dto.CustomerDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerApiServiceImpl implements CustomerApiService {

    private CustomerApiClient customerApiClient;

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
        return null;
    }

}
