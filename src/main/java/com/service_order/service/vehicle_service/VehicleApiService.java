package com.service_order.service.vehicle_service;

import com.service_order.service.dto.vehicle_dto.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "${feign.client.vehicle.name}")
public interface VehicleApiService {

    List<VehicleDto> findAllVehicles();

    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);

    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);

}
