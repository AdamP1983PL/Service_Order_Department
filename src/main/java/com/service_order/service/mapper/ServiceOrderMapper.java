package com.service_order.service.mapper;

import com.service_order.model.service_order.domain.ServiceOrder;
import com.service_order.service.dto.ServiceOrderDto;
import org.springframework.stereotype.Component;

@Component
public class ServiceOrderMapper {

    public ServiceOrder mapToServiceOrder(ServiceOrderDto serviceOrderDto) {
        return ServiceOrder.builder()
                .id(serviceOrderDto.getId())
                .dateTimeCreated(serviceOrderDto.getDateTimeCreated())
                .dateTimeUpdated(serviceOrderDto.getDateTimeUpdated())
                .dateTimeDeadline(serviceOrderDto.getDateTimeDeadline())
                .customerId(serviceOrderDto.getCustomerId())
                .vehicleId(serviceOrderDto.getVehicleId())
                .serviceOperationId(serviceOrderDto.getServiceOperationId())
                .orderStatus(serviceOrderDto.getOrderStatus())
                .isServiceOrderClosed(serviceOrderDto.getIsServiceOrderClosed())
                .build();
    }

    public ServiceOrderDto mapToServiceOrderDto(ServiceOrder serviceOrder) {
        return ServiceOrderDto.builder()
                .id(serviceOrder.getId())
                .dateTimeCreated(serviceOrder.getDateTimeCreated())
                .dateTimeUpdated(serviceOrder.getDateTimeUpdated())
                .dateTimeDeadline(serviceOrder.getDateTimeDeadline())
                .customerId(serviceOrder.getCustomerId())
                .vehicleId(serviceOrder.getVehicleId())
                .serviceOperationId(serviceOrder.getServiceOperationId())
                .orderStatus(serviceOrder.getOrderStatus())
                .isServiceOrderClosed(serviceOrder.getIsServiceOrderClosed())
                .build();
    }

}
