package com.service_order.model.service_order.repository;

import com.service_order.model.service_order.domain.ServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> {


}
