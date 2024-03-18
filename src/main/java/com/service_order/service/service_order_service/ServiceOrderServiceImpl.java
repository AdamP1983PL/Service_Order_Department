package com.service_order.service.service_order_service;

import com.service_order.exception.ResourceNotFoundException;
import com.service_order.model.enums.OrderStatus;
import com.service_order.model.service_order.domain.ServiceOrder;
import com.service_order.model.service_order.repository.ServiceOrderRepository;
import com.service_order.service.dto.service_order_dto.ServiceOrderDto;
import com.service_order.service.mapper.ServiceOrderMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class ServiceOrderServiceImpl implements ServiceOrderService {

    private ServiceOrderRepository serviceOrderRepository;
    private ServiceOrderMapper serviceOrderMapper;


    @Override
    public List<ServiceOrderDto> findAllServiceOrders() {
        log.info("====>>>> findAllServiceOrders() execution.");
        return serviceOrderRepository.findAll().stream()
                .map(serviceOrderMapper::mapToServiceOrderDto)
                .collect(Collectors.toList());
    }

    @Override
    public ServiceOrderDto findServiceOrderById(Long id) {
        ServiceOrder serviceOrder = serviceOrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service order", "id: ", Long.toString(id)));
        log.info("====>>>> findServiceOrderById(" + id + ") execution.");
        return serviceOrderMapper.mapToServiceOrderDto(serviceOrder);
    }

    @Override
    public List<ServiceOrderDto> findServiceOrdersByStatus(OrderStatus orderStatus) {
        log.info("====>>>> findServiceOrdersByStatus(" + orderStatus.toString() + ") execution.");
        return serviceOrderRepository.findServiceOrderByOrderStatus(orderStatus).stream()
                .map(serviceOrderMapper::mapToServiceOrderDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ServiceOrderDto> findServiceOrdersByCustomerId(Long id) {
        log.info("====>>>> findServiceOrdersByCustomerId(" + id + ") execution.");
        return serviceOrderRepository.findServiceOrderByCustomerId(id).stream()
                .map(serviceOrderMapper::mapToServiceOrderDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ServiceOrderDto> findServiceOrdersByVehicleId(Long id) {
        log.info("====>>>>findServiceOrdersByVehicleId(" + id + ") execution.");
        return serviceOrderRepository.findServiceOrderByVehicleId(id).stream()
                .map(serviceOrderMapper::mapToServiceOrderDto)
                .collect(Collectors.toList());
    }

    @Override
    public ServiceOrderDto createServiceOrder(ServiceOrderDto serviceOrderDto) {
        ServiceOrder savedServiceOrder = serviceOrderRepository.save(serviceOrderMapper.mapToServiceOrder(serviceOrderDto));
        log.info("====>>>> createServiceOrder() execution.");
        return serviceOrderMapper.mapToServiceOrderDto(savedServiceOrder);
    }

    @Override
    public ServiceOrderDto updateServiceOrder(ServiceOrderDto serviceOrderDto, Long id) {
        ServiceOrder serviceOrder = serviceOrderRepository.findById(id)
                .map(order -> {
                    order.setDateTimeDeadline(serviceOrderDto.getDateTimeDeadline());
                    order.setCustomerId(serviceOrderDto.getCustomerId());
                    order.setVehicleId(serviceOrderDto.getVehicleId());
                    order.setOrderStatus(serviceOrderDto.getOrderStatus());
                    order.setDescription1(serviceOrderDto.getDescription1());
                    order.setDescription2(serviceOrderDto.getDescription2());
                    order.setDescription3(serviceOrderDto.getDescription3());
                    order.setDescription4(serviceOrderDto.getDescription4());
                    order.setDescription5(serviceOrderDto.getDescription5());
                    order.setDescription6(serviceOrderDto.getDescription6());
                    return serviceOrderRepository.save(order);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Service order", "id: ", Long.toString(id)));

        log.info("====>>>> updateServiceOrder(" + id + ") execution.");
        return serviceOrderMapper.mapToServiceOrderDto(serviceOrder);
    }

    @Override
    public ServiceOrderDto updateServiceOrderStatus(ServiceOrderDto serviceOrderDto, Long id) {
        ServiceOrder serviceOrder = serviceOrderRepository.findById(id)
                .map(order -> {
                    order.setOrderStatus(serviceOrderDto.getOrderStatus());
                    return serviceOrderRepository.save(order);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Service order", "id: ", Long.toString(id)));

        log.info("====>>>> updateServiceOrderStatus(status: "
                + serviceOrderDto.getOrderStatus() + ", id: " + id + ") execution.");
        return serviceOrderMapper.mapToServiceOrderDto(serviceOrder);
    }

    @Override
    public void deleteServiceOrder(Long id) {
        ServiceOrder serviceOrder = serviceOrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service order", "id: ", Long.toString(id)));
        log.info("====>>>> deleteServiceOrder(" + id + ") execution.");
        serviceOrderRepository.delete(serviceOrder);
    }
}