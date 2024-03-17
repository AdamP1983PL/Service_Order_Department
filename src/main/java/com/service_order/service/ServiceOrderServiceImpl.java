package com.service_order.service;

import com.service_order.model.enums.OrderStatus;
import com.service_order.model.service_order.repository.ServiceOrderRepository;
import com.service_order.service.dto.ServiceOrderDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ServiceOrderServiceImpl implements ServiceOrderService{

    private ServiceOrderRepository serviceOrderRepository;


    @Override
    public List<ServiceOrderDto> findAllServiceOrders() {
        return null;
    }

    @Override
    public ServiceOrderDto findServiceOrderById() {
        return null;
    }

    @Override
    public List<ServiceOrderDto> findServiceOrderByStatus(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public List<ServiceOrderDto> findServiceOrderByCustomerId(Long id) {
        return null;
    }

    @Override
    public List<ServiceOrderDto> findServiceOrderByVehicleId(Long id) {
        return null;
    }

    @Override
    public ServiceOrderDto createServiceOrder(ServiceOrderDto serviceOrderDto) {
        return null;
    }

    @Override
    public ServiceOrderDto updateServiceOrder(ServiceOrderDto serviceOrderDto) {
        return null;
    }

    @Override
    public ServiceOrderDto updateServiceOrderStatus(ServiceOrderDto serviceOrderDto, Long id) {
        return null;
    }

    @Override
    public void deleteServiceOrder(Long id) {

    }
}
