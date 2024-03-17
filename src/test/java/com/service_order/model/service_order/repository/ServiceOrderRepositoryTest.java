package com.service_order.model.service_order.repository;

import com.service_order.model.enums.OrderStatus;
import com.service_order.model.service_order.domain.ServiceOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceOrderRepositoryTest {
    private ServiceOrder serviceOrder1;
    private ServiceOrder serviceOrder2;

    @Autowired
    private ServiceOrderRepository serviceOrderRepository;

    @BeforeEach()
    void initialize() {
        serviceOrder1 = ServiceOrder.builder()
                .id(1L)
                .dateTimeCreated(LocalDateTime.of(2024, 3, 17, 12, 0, 0))
                .dateTimeUpdated(LocalDateTime.of(2024, 3, 17, 13, 0, 0))
                .dateTimeDeadline(LocalDateTime.of(2024, 3, 24, 9, 0, 0))
                .customerId(11L)
                .vehicleId(111L)
                .serviceOperationId(1111L)
                .orderStatus(OrderStatus.IN_PROGRESS)
                .isServiceOrderClosed(false)
                .build();

        serviceOrder2 = ServiceOrder.builder()
                .id(2L)
                .dateTimeCreated(LocalDateTime.of(2025, 6, 18, 12, 0, 0))
                .dateTimeUpdated(LocalDateTime.of(2025, 6, 19, 13, 0, 0))
                .dateTimeDeadline(LocalDateTime.of(2025, 6, 20, 14, 0, 0))
                .customerId(11L)
                .vehicleId(222L)
                .serviceOperationId(2222L)
                .orderStatus(OrderStatus.OPEN)
                .isServiceOrderClosed(false)
                .build();

        serviceOrderRepository.save(serviceOrder1);
        serviceOrderRepository.save(serviceOrder2);
    }

    @AfterEach()
    void cleanUp() {
        serviceOrderRepository.deleteAll();
    }

    @Test
    @DisplayName("Testing findServiceOrderByOrderStatus(OrderStatus orderStatus) query - negative scenario.")
    public void givenServiceOrderList_whenFindServiceOrderByStatus_thenReturnEmptyList() {
        // given
        // when
        List<ServiceOrder> testList = serviceOrderRepository.findServiceOrderByOrderStatus(OrderStatus.INVOICED);

        // then
        assertEquals(0, testList.size());
    }

    @Test
    @DisplayName("Testing findServiceOrderByOrderStatus(OrderStatus orderStatus) query - positive scenario.")
    public void givenServiceOrderList_whenFindServiceOrderByStatus_thenReturnOneEntity() {
        // given
        // when
        List<ServiceOrder> testList = serviceOrderRepository.findServiceOrderByOrderStatus(OrderStatus.IN_PROGRESS);

        // then
        assertAll(
                () -> assertNotNull(testList),
                () -> assertEquals(1, testList.size()),
                () -> assertEquals(serviceOrder1.getIsServiceOrderClosed(), testList.get(0).getIsServiceOrderClosed())
        );
    }

    @Test
    @DisplayName("Testing findServiceOrderByCustomerId(Long id) query - positive scenario.")
    public void givenServiceOrderList_whenFindServiceOrderByCustomerId_thenReturnOneEntity() {
        // given
        // when
        List<ServiceOrder> testList = serviceOrderRepository.findServiceOrderByCustomerId(11L);

        // then
        assertAll(
                () -> assertNotNull(testList),
                () -> assertEquals(2, testList.size()),
                () -> assertEquals(2024, testList.get(0).getDateTimeCreated().getYear()),
                () -> assertEquals(OrderStatus.OPEN, testList.get(1).getOrderStatus())
        );

    }

    @Test
    @DisplayName("Testing findServiceOrderByCustomerId(Long id) query - negative scenario.")
    public void givenServiceOrderList_whenFindServiceOrderByCustomerId_thenReturnEmptyList() {
        // given
        // when
        List<ServiceOrder> testList = serviceOrderRepository.findServiceOrderByCustomerId(999L);

        // then
        assertEquals(0, testList.size());
    }

    @Test
    @DisplayName("Testing findServiceOrderByVehicleId(Long id) query - positive scenario")
    public void givenServiceOrderList_whenFindServiceOrderByVehicleId_thenReturnOneEntity() {
        // given
        // when
        List<ServiceOrder> testList = serviceOrderRepository.findServiceOrderByVehicleId(222L);

        // then
        assertAll(
                () -> assertNotNull(testList),
                () -> assertEquals(1, testList.size()),
                () -> assertEquals(OrderStatus.OPEN, testList.get(0).getOrderStatus())
        );
    }

    @Test
    @DisplayName("Testing findServiceOrderByVehicleId(Long id) query - negative scenario")
    public void given_when_then() {
        // given
        // when
        List<ServiceOrder> testList = serviceOrderRepository.findServiceOrderByVehicleId(999L);

        // then
        assertEquals(0, testList.size());
    }

}
