package com.service_order.service.mapper;

import com.service_order.model.enums.OrderStatus;
import com.service_order.model.service_order.domain.ServiceOrder;
import com.service_order.service.dto.ServiceOrderDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceOrderMapperTest {
    private ServiceOrder serviceOrder;
    private ServiceOrderDto serviceOrderDto;

    @Autowired
    private ServiceOrderMapper serviceOrderMapper;

    @BeforeEach()
    void initialize() {
        serviceOrder = ServiceOrder.builder()
                .id(1L)
                .dateTimeCreated(LocalDateTime.of(2024, 3, 17, 12, 0, 0))
                .dateTimeUpdated(LocalDateTime.of(2024, 3, 17, 13, 0, 0))
                .dateTimeDeadline(LocalDateTime.of(2024, 3, 24, 9, 0, 0))
                .customerId(11L)
                .customerTaxNumber("111222333")
                .vehicleId(111L)
                .vehicleRegistrationNumber("111111")
                .serviceOperationId(1111L)
                .orderStatus(OrderStatus.IN_PROGRESS)
                .isServiceOrderClosed(false)
                .build();

        serviceOrderDto = ServiceOrderDto.builder()
                .id(1L)
                .dateTimeCreated(LocalDateTime.of(2024, 3, 17, 12, 0, 0))
                .dateTimeUpdated(LocalDateTime.of(2024, 3, 17, 13, 0, 0))
                .dateTimeDeadline(LocalDateTime.of(2024, 3, 24, 9, 0, 0))
                .customerId(11L)
                .customerTaxNumber("111222333")
                .vehicleId(111L)
                .vehicleRegistrationNumber("111111")
                .serviceOperationId(1111L)
                .orderStatus(OrderStatus.IN_PROGRESS)
                .isServiceOrderClosed(false)
                .build();
    }

    @Test
    @DisplayName("Testing mapToServiceOrder(ServiceOrderDto serviceOrderDto) method.")
    public void givenServiceOrderDto_whenMapToServiceOrder_thenReturnServiceOrder() {
        // given
        // when
        ServiceOrder mappedServiceOrder = serviceOrderMapper.mapToServiceOrder(serviceOrderDto);

        // then
        assertAll(
                () -> assertNotNull(mappedServiceOrder),
                () -> assertEquals(1L, mappedServiceOrder.getId()),
                () -> assertEquals(LocalDateTime.of(2024, 3, 17, 12, 0, 0),
                        mappedServiceOrder.getDateTimeCreated()),
                () -> assertEquals(LocalDateTime.of(2024, 3, 17, 13, 0, 0),
                        mappedServiceOrder.getDateTimeUpdated()),
                () -> assertEquals(LocalDateTime.of(2024, 3, 24, 9, 0, 0),
                        mappedServiceOrder.getDateTimeDeadline()),
                () -> assertEquals(11, mappedServiceOrder.getCustomerId()),
                () -> assertEquals("111222333", mappedServiceOrder.getCustomerTaxNumber()),
                () -> assertEquals(111, mappedServiceOrder.getVehicleId()),
                () -> assertEquals("111111", mappedServiceOrder.getVehicleRegistrationNumber()),
                () -> assertEquals(1111, mappedServiceOrder.getServiceOperationId()),
                () -> assertEquals(OrderStatus.IN_PROGRESS, mappedServiceOrder.getOrderStatus()),
                () -> assertEquals(false, mappedServiceOrder.getIsServiceOrderClosed())
        );
    }

    @Test
    @DisplayName("Testing ServiceOrderDto mapToServiceOrderDto(ServiceOrder serviceOrder) method.")
    public void givenServiceOrder_whenMapToServiceOrderDto_thenReturnServiceOrderDto() {
        // given
        // when
        ServiceOrderDto mappedServiceOrderDto = serviceOrderMapper.mapToServiceOrderDto(serviceOrder);

        // then
        assertAll(
                () -> assertNotNull(mappedServiceOrderDto),
                () -> assertEquals(1L, mappedServiceOrderDto.getId()),
                () -> assertEquals(LocalDateTime.of(2024, 3, 17, 12, 0, 0),
                        mappedServiceOrderDto.getDateTimeCreated()),
                () -> assertEquals(LocalDateTime.of(2024, 3, 17, 13, 0, 0),
                        mappedServiceOrderDto.getDateTimeUpdated()),
                () -> assertEquals(LocalDateTime.of(2024, 3, 24, 9, 0, 0),
                        mappedServiceOrderDto.getDateTimeDeadline()),
                () -> assertEquals(11, mappedServiceOrderDto.getCustomerId()),
                () -> assertEquals("111222333", mappedServiceOrderDto.getCustomerTaxNumber()),
                () -> assertEquals(111, mappedServiceOrderDto.getVehicleId()),
                () -> assertEquals("111111", mappedServiceOrderDto.getVehicleRegistrationNumber()),
                () -> assertEquals(1111, mappedServiceOrderDto.getServiceOperationId()),
                () -> assertEquals(OrderStatus.IN_PROGRESS, mappedServiceOrderDto.getOrderStatus()),
                () -> assertEquals(false, mappedServiceOrderDto.getIsServiceOrderClosed())
        );
    }

}
