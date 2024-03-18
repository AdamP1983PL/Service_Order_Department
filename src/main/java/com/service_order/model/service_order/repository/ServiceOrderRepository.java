package com.service_order.model.service_order.repository;

import com.service_order.model.enums.OrderStatus;
import com.service_order.model.service_order.domain.ServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> {

    List<ServiceOrder> findServiceOrderByOrderStatus(OrderStatus orderStatus);

    List<ServiceOrder> findServiceOrderByCustomerId(Long id);

    List<ServiceOrder> findServiceOrderByVehicleId(Long id);

}

// todo use JPQL
