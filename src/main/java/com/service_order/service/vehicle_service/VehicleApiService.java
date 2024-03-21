package com.service_order.service.vehicle_service;

import com.service_order.service.dto.vehicle_dto.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// todo delete @FeignClient
@FeignClient(name = "VEHICLE-FEIGN-CLIENT")
public interface VehicleApiService {

    List<VehicleDto> findAllVehicles();

    VehicleDto findVehicleById(@PathVariable("id") Long id);

    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);

    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);

}
