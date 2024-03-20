package com.service_order.service.service_order_service;

import com.service_order.model.enums.OrderStatus;
import com.service_order.service.dto.service_order_dto.ServiceOrderDto;

import java.util.List;

public interface ServiceOrderService {

    List<ServiceOrderDto> findAllServiceOrders();

    ServiceOrderDto findServiceOrderById(Long id);

    List<ServiceOrderDto> findServiceOrdersByStatus(OrderStatus orderStatus);

    List<ServiceOrderDto> findServiceOrdersByCustomerId(Long id);

//    List<ServiceOrderDto> findServiceOrdersByVehicleId(Long id);

    ServiceOrderDto createServiceOrder(ServiceOrderDto serviceOrderDto);

    ServiceOrderDto updateServiceOrder(ServiceOrderDto serviceOrderDto, Long id);

    ServiceOrderDto updateServiceOrderStatus(ServiceOrderDto serviceOrderDto, Long id);

    ServiceOrderDto mvcUpdateServiceOrder(ServiceOrderDto serviceOrderDto);

    void deleteServiceOrder(Long id);

}
