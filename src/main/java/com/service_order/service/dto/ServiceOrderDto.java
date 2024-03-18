package com.service_order.service.dto;

import com.service_order.model.enums.OrderStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceOrderDto {

    private Long id;
    private LocalDateTime dateTimeCreated;
    private LocalDateTime dateTimeUpdated;
    private LocalDateTime dateTimeDeadline;
    private Long customerId;
    private String customerTaxNumber;
    private Long vehicleId;
    private String vehicleRegistrationNumber;
    private Long serviceOperationId;
    private OrderStatus orderStatus;
    private Boolean isServiceOrderClosed;

}
