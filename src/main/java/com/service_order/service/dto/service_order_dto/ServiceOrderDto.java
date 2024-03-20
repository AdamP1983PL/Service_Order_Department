package com.service_order.service.dto.service_order_dto;

import com.service_order.model.enums.OrderStatus;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class ServiceOrderDto {

    private Long id;
    private LocalDateTime dateTimeCreated;
    private LocalDateTime dateTimeUpdated;
    private LocalDateTime dateTimeDeadline;
    private Long customerId;
    private String customerName;
    private Long vehicleId;
    private String vehicleRegistrationNumber;
    private OrderStatus orderStatus;
    private String description1;
    private String description2;
    private String description3;

    public ServiceOrderDto() {
    }

    public ServiceOrderDto(Long id,
                           LocalDateTime dateTimeCreated,
                           LocalDateTime dateTimeUpdated,
                           LocalDateTime dateTimeDeadline,
                           Long customerId,
                           String customerName,
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
        return "ServiceOrderDto{" +
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
