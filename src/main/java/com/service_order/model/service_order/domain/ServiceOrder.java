package com.service_order.model.service_order.domain;

import com.service_order.model.enums.OrderStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SERVICE_ORDER")
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "DATE_TIME_CREATED")
    private LocalDateTime dateTimeCreated;

    @UpdateTimestamp
    @Column(name = "DATE_TIME_UPDATED")
    private LocalDateTime dateTimeUpdated;

    @Column(name = "DATE_TIME_DEADLINE", nullable = false)
    private LocalDateTime dateTimeDeadline;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

    @Column(name = "VEHICLE_ID", nullable = false)
    private Long vehicleId;

    @Column(name = "SERVICE_OPERATION_IS")
    private Long serviceOperationId;

    @Column(name = "ORDER_STATUS", nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "IS_CLOSED", nullable = false)
    private Boolean isServiceOrderClosed;

}
