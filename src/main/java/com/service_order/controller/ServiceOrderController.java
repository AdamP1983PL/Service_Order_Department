package com.service_order.controller;

import com.service_order.model.enums.OrderStatus;
import com.service_order.service.dto.service_order_dto.ServiceOrderDto;
import com.service_order.service.service_order_service.ServiceOrderServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/service-order")
@AllArgsConstructor
public class ServiceOrderController {

    private ServiceOrderServiceImpl serviceOrderServiceImpl;

    @GetMapping("/")
    public ResponseEntity<List<ServiceOrderDto>> findAllServiceOrders() {
        List<ServiceOrderDto> serviceOrderDtoList = serviceOrderServiceImpl.findAllServiceOrders();
        log.info("====>>>> findAllServiceOrders() execution.");
        return new ResponseEntity<>(serviceOrderDtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceOrderDto> findServiceOrderById(@PathVariable("id") Long id) {
        ServiceOrderDto serviceOrderDto = serviceOrderServiceImpl.findServiceOrderById(id);
        log.info("====>>>> findServiceOrderById(" + id + ") execution.");
        return new ResponseEntity<>(serviceOrderDto, HttpStatus.OK);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<ServiceOrderDto>> findServiceOrdersByStatus(@PathVariable("status") OrderStatus status) {
        List<ServiceOrderDto> serviceOrderDtoList = serviceOrderServiceImpl.findServiceOrdersByStatus(status);
        log.info("====>>>> findServiceOrdersByStatus(" + status.toString() + ") execution.");
        return new ResponseEntity<>(serviceOrderDtoList, HttpStatus.OK);
    }

    @GetMapping("/customer-id/{id}")
    public ResponseEntity<List<ServiceOrderDto>> findServiceOrderByCustomerId(@PathVariable("id") Long id) {
        List<ServiceOrderDto> serviceOrderDtoList = serviceOrderServiceImpl.findServiceOrdersByCustomerId(id);
        log.info("====>>>> findServiceOrderByCustomerId(" + id + ") execution.");
        return new ResponseEntity<>(serviceOrderDtoList, HttpStatus.OK);
    }

    @GetMapping("/vehicle-d/{id}")
    public ResponseEntity<List<ServiceOrderDto>> findServiceOrderByVehicleId(@PathVariable("id") Long id) {
        List<ServiceOrderDto> serviceOrderDtoList = serviceOrderServiceImpl.findServiceOrdersByVehicleId(id));
        log.info("====>>>> findServiceOrderByVehicleId(" + id + ") execution.");
        return new ResponseEntity<>(serviceOrderDtoList, HttpStatus.OK);
    }



}
