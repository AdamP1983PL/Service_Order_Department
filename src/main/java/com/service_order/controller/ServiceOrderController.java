package com.service_order.controller;

import com.service_order.service.service_order_service.ServiceOrderServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/service-order")
@AllArgsConstructor
public class ServiceOrderController {

    private ServiceOrderServiceImpl serviceOrderServiceImpl;




}
