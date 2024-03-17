package com.service_order.service;

import com.service_order.model.enums.OrderStatus;
import com.service_order.service.dto.ServiceOrderDto;

import java.util.List;

public interface ServiceOrderService {

    List<ServiceOrderDto> findAllServiceOrders();

    ServiceOrderDto findServiceOrderById();

    List<ServiceOrderDto> findServiceOrderByStatus(OrderStatus orderStatus);

    List<ServiceOrderDto> findServiceOrderByCustomerId(Long id);

    List<ServiceOrderDto> findServiceOrderByVehicleId(Long id);

    ServiceOrderDto createServiceOrder(ServiceOrderDto serviceOrderDto);

    ServiceOrderDto updateServiceOrder(ServiceOrderDto serviceOrderDto);

    ServiceOrderDto updateServiceOrderStatus(ServiceOrderDto serviceOrderDto, Long id);

    void deleteServiceOrder(Long id);

}
