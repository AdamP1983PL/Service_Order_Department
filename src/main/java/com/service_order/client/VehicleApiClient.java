package com.service_order.client;

import com.service_order.service.dto.vehicle_dto.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "VEHICLE-DEPARTMENT")
public interface VehicleApiClient {

    @GetMapping("/vehicles/all-vehicles")
    List<VehicleDto> findAllVehicles();

    @GetMapping("/vehicles/id/{id}")
    VehicleDto findVehicleById(@PathVariable("id") Long id);

    @GetMapping("/vehicles/vin/{vin}")
    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);

    @GetMapping("/vehicles/reg-num/{number}")
    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);

}
