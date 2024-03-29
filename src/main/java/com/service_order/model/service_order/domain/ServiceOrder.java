package com.service_order.model.service_order.domain;

import com.service_order.model.enums.OrderStatus;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @Column(name = "DATE_TIME_DEADLINE")
//            , nullable = false)
    private LocalDateTime dateTimeDeadline;

    @Column(name = "CUSTOMER_ID")
//    , nullable = false)
    private Long customerId;

    @Column(name = "CUSTOMER_NAME")
//    , nullable = false)
    private String customerName;

    @Column(name = "VEHICLE_ID")
//    , nullable = false)
    private Long vehicleId;

    @Column(name = "VEHICLE_REGISTRATION")
//    , nullable = false)
    private String vehicleRegistrationNumber;

    @Column(name = "ORDER_STATUS")
//    , nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "DESC_1")
//    , nullable = false)
    private String description1;

    @Column(name = "DESC_2")
    private String description2;

    @Column(name = "DESC_3")
    private String description3;

    public ServiceOrder() {
    }

    public ServiceOrder(Long id,
                        LocalDateTime dateTimeCreated,
                        LocalDateTime dateTimeUpdated,
                        LocalDateTime dateTimeDeadline,
                        Long customerId, String customerName,
                        Long vehicleId,
                        String vehicleRegistrationNumber,
                        OrderStatus orderStatus,
                        String description1,
                        String description2,
                        String description3) {
        this.id = id;
        this.dateTimeCreated = dateTimeCreated;
        this.dateTimeUpdated = dateTimeUpdated;
        this.dateTimeDeadline = dateTimeDeadline;
        this.customerId = customerId;
        this.customerName = customerName;
        this.vehicleId = vehicleId;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.orderStatus = orderStatus;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(LocalDateTime dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public LocalDateTime getDateTimeUpdated() {
        return dateTimeUpdated;
    }

    public void setDateTimeUpdated(LocalDateTime dateTimeUpdated) {
        this.dateTimeUpdated = dateTimeUpdated;
    }

    public LocalDateTime getDateTimeDeadline() {
        return dateTimeDeadline;
    }

    public void setDateTimeDeadline(LocalDateTime dateTimeDeadline) {
        this.dateTimeDeadline = dateTimeDeadline;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    @Override
    public String toString() {
        return "ServiceOrder{" +
                "id=" + id +
                ", dateTimeCreated=" + dateTimeCreated +
                ", dateTimeUpdated=" + dateTimeUpdated +
                ", dateTimeDeadline=" + dateTimeDeadline +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", vehicleId=" + vehicleId +
                ", vehicleRegistrationNumber='" + vehicleRegistrationNumber + '\'' +
                ", orderStatus=" + orderStatus +
                ", description1='" + description1 + '\'' +
                ", description2='" + description2 + '\'' +
                ", description3='" + description3 + '\'' +
                '}';
    }
}
