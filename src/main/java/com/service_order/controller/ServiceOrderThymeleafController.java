package com.service_order.controller;

import com.service_order.service.dto.service_order_dto.ServiceOrderDto;
import com.service_order.service.dto.vehicle_dto.VehicleDto;
import com.service_order.service.service_order_service.ServiceOrderServiceImpl;
import com.service_order.service.vehicle_service.VehicleApiServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
public class ServiceOrderThymeleafController {

    private final ServiceOrderServiceImpl serviceOrderServiceImpl;
    private final VehicleApiServiceImpl vehicleApiServiceImpl;

    public ServiceOrderThymeleafController(ServiceOrderServiceImpl serviceOrderServiceImpl, VehicleApiServiceImpl vehicleApiServiceImpl) {
        this.serviceOrderServiceImpl = serviceOrderServiceImpl;
        this.vehicleApiServiceImpl = vehicleApiServiceImpl;
    }

    @GetMapping("/service-order/find-all")
    public String showAllServiceOrders(Model model) {
        List<ServiceOrderDto> serviceOrderDtoList = serviceOrderServiceImpl.findAllServiceOrders();
        model.addAttribute("serviceOrderDtoList", serviceOrderDtoList);
        log.info("====>>>> showAllServiceOrders() execution.");
        return "all-service-orders";
    }

    @GetMapping("/service-order/create-new")
    public String showAddServiceOrderPage(Model model) {
        ServiceOrderDto serviceOrderDto = new ServiceOrderDto();
        model.addAttribute("serviceOrderDto", serviceOrderDto);
        List<VehicleDto> vehicleDtoList = vehicleApiServiceImpl.findAllVehicles();
        model.addAttribute("vehicles", vehicleDtoList);
//        todo delete "list"
        log.info("====>>>> showAddServiceOrderPage() execution");
        return "add-new-service-order";
    }

    @PostMapping("/service-order/save")
    public String saveNewServiceOrder(@ModelAttribute("serviceOrderDto") ServiceOrderDto serviceOrderDto,
                                      BindingResult result, Model model) {

        log.info("saveNewServiceOrder(" + serviceOrderDto + ")");

        if (result.hasErrors()) {
            log.info("====>>>> saveNewServiceOrder() result.hasError() execution.");
            model.addAttribute("serviceOrderDto", serviceOrderDto);
            return "add-new-service-order";
        }
        serviceOrderServiceImpl.createServiceOrder(serviceOrderDto);
        log.info("====>>>> saveNewServiceOrder() execution.");
        return "redirect:/service-order/find-all";
    }


    @GetMapping("/service-order/details/{id}")
    public String listServiceOrderDetails(@PathVariable("id") Long id, Model model) {
        ServiceOrderDto serviceOrderDto = serviceOrderServiceImpl.findServiceOrderById(id);
        model.addAttribute("serviceOrderDto", serviceOrderDto);
        log.info("====>>>> listServiceOrderDetails(" + id + ") execution.");
        return "service-order-details";
    }

    @GetMapping("/service-order/edit/{id}")
    public String editServiceOrder(@PathVariable("id") Long id, Model model) {
        ServiceOrderDto serviceOrderDto = serviceOrderServiceImpl.findServiceOrderById(id);
        model.addAttribute("serviceOrderDto", serviceOrderDto);
        log.info("====>>>> editServiceOrder(" + id + ") execution.");
        return "edit-service-order";
    }

    @PutMapping("/service-order/update/{id}")
    public String updateServiceOrder(@PathVariable("id") Long id,
                                     @Valid @ModelAttribute("serviceOrderDto") ServiceOrderDto serviceOrderDto,
                                     BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("serviceOrderDto", serviceOrderDto);
            return "edit-service-order";
        }
        serviceOrderDto.setId(id);
        serviceOrderServiceImpl.mvcUpdateServiceOrder(serviceOrderDto);
        log.info("====>>>> updateServiceOrder(" + id + ") execution.");
        return "redirect:/find-all-service-orders";
    }

    @GetMapping("/service-order/service-order/delete/{id}")
    public String deleteServiceOrder(@PathVariable("id") Long id) {
        serviceOrderServiceImpl.deleteServiceOrder(id);
        log.info("====>>>> deleteServiceOrder(" + id + ") execution");
        return "redirect:/find-all-service-orders";
    }

    @GetMapping("/service-order/find-all_vehicles")
    public String showAllVehicles(Model model) {
        List<VehicleDto> vehicleDtoList = vehicleApiServiceImpl.findAllVehicles();
        model.addAttribute("vehicleDtoList", vehicleDtoList);
        log.info("====>>>> showAllVehicles() execution.");
        return "vehicle/vehicle-list";
    }

//    @GetMapping("service-order/find-all_vehicles")
//    public String showAllCustomers(Model model) {
//        List<VehicleDto> vehicleDtoList = vehicleApiServiceImpl.findAllVehicles();
//        model.addAttribute("vehicleDtoList", vehicleDtoList);
//        log.info("====>>>> showAllVehicles() execution.");
//        return "vehicle/vehicle-list";
//    }

}















