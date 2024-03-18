package com.service_order.client;

import com.service_order.service.dto.vehicle_dto.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "${vehicle-department.application.name}")
public interface VehicleApiClient {

    @GetMapping("/api/vehicle/")
    List<VehicleDto> findAllVehicles();

    @GetMapping("/api/vehicle/vin/{vin}")
    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);

    @GetMapping("/api/vehicle/reg-num/{number}")
    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);

}
