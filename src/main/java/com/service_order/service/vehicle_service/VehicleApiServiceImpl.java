package com.service_order.service.vehicle_service;

import com.service_order.client.VehicleApiClient;
import com.service_order.service.dto.vehicle_dto.VehicleDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VehicleApiServiceImpl implements VehicleApiService {

    private VehicleApiClient vehicleApiClient;

    @Override
    public List<VehicleDto> findAllVehicles() {
        return vehicleApiClient.findAllVehicles();
    }

    @Override
    public VehicleDto findVehicleByVIN(String vin) {
        return vehicleApiClient.findVehicleByVIN(vin);
    }

    @Override
    public VehicleDto findVehicleByRegistrationNumber(String number) {
        return vehicleApiClient.findVehicleByRegistrationNumber(number);
    }

}
