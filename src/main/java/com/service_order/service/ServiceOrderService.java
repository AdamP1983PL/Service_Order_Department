package com.service_order.service;

import com.service_order.model.enums.OrderStatus;
import com.service_order.service.dto.ServiceOrderDto;

import java.util.List;

public interface ServiceOrderService {

    List<ServiceOrderDto> findAllServiceOrders();

    ServiceOrderDto findServiceOrderById(Long id);

    List<ServiceOrderDto> findServiceOrdersByStatus(OrderStatus orderStatus);

    List<ServiceOrderDto> findServiceOrdersByCustomerId(Long id);

    List<ServiceOrderDto> findServiceOrdersByVehicleId(Long id);

    ServiceOrderDto createServiceOrder(ServiceOrderDto serviceOrderDto);

    ServiceOrderDto updateServiceOrder(ServiceOrderDto serviceOrderDto, Long id);

    ServiceOrderDto updateServiceOrderStatus(ServiceOrderDto serviceOrderDto, Long id);

    void deleteServiceOrder(Long id);

}
