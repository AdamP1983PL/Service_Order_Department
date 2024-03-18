package com.service_order.service.dto.service_order_dto;

import com.service_order.model.enums.OrderStatus;
import lombok.*;

import javax.persistence.Column;
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
//    private Long serviceOperationId;
    private OrderStatus orderStatus;
    private Boolean isServiceOrderClosed;
    private String description1;
    private String description2;
    private String description3;
    private String description4;
    private String description5;
    private String description6;

}
